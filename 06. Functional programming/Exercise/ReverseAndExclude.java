import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split("\\s+");
        int divisor = Integer.parseInt(scanner.nextLine());

        ArrayList<String> numbers = new ArrayList<String>(Arrays.asList(nums));
        Collections.reverse(numbers);

        Predicate<Integer> divisible = n -> n%divisor == 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (divisible.test(Integer.parseInt(numbers.get(i)))){
                numbers.remove(i);
                i--;
            }
            else {
                System.out.print(numbers.get(i)+" ");
            }
        }

    }
}
