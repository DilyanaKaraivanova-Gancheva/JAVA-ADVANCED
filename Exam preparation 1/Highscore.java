import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Highscore {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Long> scores = new LinkedHashMap<>();
        Map<String, List<String>> duels = new LinkedHashMap<>();

        String[] line = bf.readLine().split("<->");

        while (!"osu!".equalsIgnoreCase(line[0])){
            String[] firstPlayer = line[0].split("\\s+");
            String[] secondPlayer = line[1].split("\\s+");

            long firstScore = Integer.valueOf(firstPlayer[0]);
            String firstName = firstPlayer[1];

            long secondScore = Integer.valueOf(secondPlayer[1]);
            String secondName = secondPlayer[0];

            putScores(firstScore-secondScore, firstName, scores);
            putScores(secondScore- firstScore, secondName, scores);

            putDuels(firstName, secondName, firstScore-secondScore, duels);
            putDuels(secondName, firstName, secondScore-firstScore, duels);
            line = bf.readLine().split("<->");
        }
        StringBuilder result = new StringBuilder();
        scores.entrySet().stream().sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .forEach(v ->{
                    result.append(v.getKey()).append(" - (").append(v.getValue()).append(")\n");
                    duels.get(v.getKey()).forEach(s -> result.append(s).append("\n"));
                });
        System.out.println(result);
        }

    private static void putDuels(String firstName, String secondName, long score, Map<String, List<String>> duels) {
        StringBuilder duel = new StringBuilder();
        duel.append("*   ").append(secondName).append(" <-> ").append(score);
        if (!duels.containsKey(firstName)){
            duels.put(firstName, new ArrayList<>());
        }
        duels.get(firstName).add(duel.toString());
    }

    private static void putScores(long score, String name, Map<String, Long> scores) {
        if (!scores.containsKey(name)){
            scores.put(name,0L);
        }
        scores.put(name, scores.get(name) +score);
    }
}
