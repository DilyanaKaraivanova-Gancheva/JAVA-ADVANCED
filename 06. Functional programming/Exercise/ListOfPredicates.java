import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] divisors = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        BiPredicate<Integer, Integer> divisible = (a,b) -> a%b == 0;

       boolean isDivisible = true;
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < divisors.length; j++) {
                if (!divisible.test(i,divisors[j])){
                    isDivisible = false;
                }
            }

            if (isDivisible){
                System.out.printf(i + " ");
            }
            isDivisible = true;
        }
    }
}
