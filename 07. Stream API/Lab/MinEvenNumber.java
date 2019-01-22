import java.util.*;

public class MinEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.asList(scanner.nextLine().split("\\s+"));

        Optional<Double> min = numbers.stream().filter(d -> !d.isEmpty()).map(Double::valueOf)
                .filter(d -> d%2 == 0).min(Double::compare);

        if (min.isPresent()){
            System.out.printf("%.2f",min.get());
        }
        else{
            System.out.println("No match");
        }
    }
}
