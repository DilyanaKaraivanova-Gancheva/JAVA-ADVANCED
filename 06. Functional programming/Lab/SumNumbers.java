import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split(", ");

        Function<String, Integer> parser = s -> Integer.parseInt(s);

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+= parser.apply(nums[i]);
        }

        System.out.println("Count = " + nums.length);
        System.out.println("Sum = " + sum);
    }
}
