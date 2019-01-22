import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FootballStats {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<String, TreeMap<String, List<String>>> stats = new LinkedHashMap<>();

        String[] input = bf.readLine().split(" ");

        while (!"Season".equalsIgnoreCase(input[0])){
            String team1 = input[0];
            String team2 = input[2];
            String[] result = input[4].split(":");
            String team1Goals = result[0];
            String team2Goals = result[1];

            fillMap(team1,team2, team1Goals, team2Goals, stats);
            fillMap(team2,team1, team2Goals, team1Goals, stats);

            input = bf.readLine().split(" ");
        }

        String[] teams = bf.readLine().split(", ");

        for (String team : teams) {
            for (String second : stats.get(team).keySet()) {
                for (String s : stats.get(team).get(second)) {
                    System.out.println(s);
                }   
            }
        }
    }

    private static void fillMap(String team1, String team2, String team1Goals, String team2Goals,
                                Map<String, TreeMap<String, List<String >>> stats) {

        StringBuilder result = new StringBuilder();
        result.append(team1).append(" - ").append(team2).append(" -> ").append(team1Goals).append(":").append(team2Goals);

        stats.putIfAbsent(team1, new TreeMap<>());
        stats.get(team1).putIfAbsent(team2, new ArrayList<>());
        stats.get(team1).get(team2).add(result.toString());
    }
}
