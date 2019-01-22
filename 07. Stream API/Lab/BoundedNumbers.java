import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BoundedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> bounds = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());

        Stream.of(scanner.nextLine().split("\\s+")).map(Integer::valueOf)
                .filter(n -> Collections.min(bounds) <= n && Collections.max(bounds) >= n).forEach(n -> System.out.printf(n + " "));
    }
}
