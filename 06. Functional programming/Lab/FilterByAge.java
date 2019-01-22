import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        HashMap<String, Integer> people = new LinkedHashMap<>();
        for (int i = 0; i < count; i++) {
            String[] line = scanner.nextLine().split(", ");
            people.put(line[0], Integer.parseInt(line[1]));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        Predicate<Integer> test = createTest(condition, age);
        Consumer<Map.Entry<String, Integer>> printer = createPrinter(format);

        printFilteredPeople(people, test, printer);
    }

    private static Consumer<Map.Entry<String,Integer>> createPrinter(String format) {
        switch (format){
            case "name":
                return person -> System.out.printf("%s%n", person.getKey());
            case "age":
                return person -> System.out.printf("%d%n", person.getValue());
            case "name age":
                return person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());
                default:
                    return null;
        }
    }

    private static void printFilteredPeople(HashMap<String, Integer> people, Predicate<Integer> test,
                                            Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> person : people.entrySet()) {
            if (test.test(people.get(person.getKey()))){
                printer.accept(person);
            }
        }
    }

    private static Predicate<Integer> createTest(String condition, int age) {
        switch (condition){
            case "younger":
                return x -> x < age;
            case "older":
                return x -> x >= age;
                default:
                    return null;
        }
    }
}
