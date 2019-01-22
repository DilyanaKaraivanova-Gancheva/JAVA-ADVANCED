import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Integer[] nums = new Integer[input.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        Function<Integer[], Integer> findSmallest = numbers -> Collections.min(Arrays.asList(numbers));

        System.out.println(findSmallest.apply(nums));
    }
}
