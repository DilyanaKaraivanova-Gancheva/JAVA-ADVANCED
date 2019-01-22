import java.util.*;
import java.util.stream.Collectors;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\|");

        LinkedHashMap<String, LinkedHashMap<String, Long>> population = new LinkedHashMap<>();

        while (!line[0].equals("report")){
            String city = line[0];
            String country = line[1];
            long populationCount = Long.parseLong(line[2]);

            if (!population.containsKey(country)){
                LinkedHashMap<String, Long> townPopulation = new LinkedHashMap<>();
                townPopulation.put(city, populationCount);
                population.put(country, townPopulation);
            }
            else{
                population.get(country).put(city, populationCount);
            }

            line = scanner.nextLine().split("\\|");
        }

        LinkedHashMap<String, Long> result = new LinkedHashMap<>();

        for (String s : population.keySet()) {
            LinkedHashMap<String, Long> sorted = population.get(s).entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            Long totalPopulation = 0l;
            String towns = "";
            for (String s1 : sorted.keySet()) {
                Long townPop = population.get(s).get(s1);
                totalPopulation += townPop;
                towns += "=>" + s1 + ": " + townPop + "\n";
            }
            towns =  s + " (total population: " + totalPopulation + ")" + "\n" + towns.substring(0,towns.length()-1);
            result.put(towns, totalPopulation);
        }

        LinkedHashMap<String, Long> sorted = result.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (String s : sorted.keySet()) {
            System.out.println(s);
        }
    }
}
