import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MapDistricts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, List<Integer>> citiesPopulation = new HashMap<>();
        List<String> input = Arrays.asList(scanner.nextLine().split("\\s+"));
        int bound = Integer.parseInt(scanner.nextLine());

        for (String s : input) {
            String[] tokens = s.split(":");
            String city = tokens[0];
            int population = Integer.valueOf(tokens[1]);

            citiesPopulation.putIfAbsent(city, new ArrayList<>());
            citiesPopulation.get(city).add(population);
        }

        citiesPopulation.entrySet().stream()
                .filter(filterByPopulation(bound))
                .sorted(sortedByDescending())
                .forEach(print());
    }

    private static Consumer<? super Map.Entry<String,List<Integer>>> print() {
        return kv -> {
            System.out.print(kv.getKey() + ": ");
            kv.getValue().stream()
                    .sorted((s1, s2) -> s2.compareTo(s1)).limit(5).forEach(dp -> System.out.print(dp + " "));
            System.out.println();
        };
    }

    private static Comparator<? super Map.Entry<String,List<Integer>>> sortedByDescending() {
        return (kv1, kv2) ->
                Integer.compare(
                        kv2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        kv1.getValue().stream().mapToInt(Integer::valueOf).sum()
                );
    }

    private static Predicate<? super Map.Entry<String,List<Integer>>> filterByPopulation(int bound) {
        return kv -> kv.getValue().stream().mapToInt(Integer::valueOf).sum() >= bound;
    }
}
