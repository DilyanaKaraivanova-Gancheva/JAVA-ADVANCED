import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());

        nums.stream().distinct().filter(n -> n>= 10 && n<=20).limit(2).forEach(s -> System.out.printf(s + " "));
    }
}
