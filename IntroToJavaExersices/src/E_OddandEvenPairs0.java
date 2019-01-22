import java.util.Arrays;
import java.util.Scanner;

public class E_OddandEvenPairs0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        if (input.length % 2 == 0) {
            for (int i = 0; i < input.length - 1; i += 2) {
                if (input[i] % 2 == 0 && input[i + 1] % 2 == 0) {
                    System.out.printf("%d, %d -> both are even%n", input[i], input[i + 1]);
                } else if (input[i] % 2 == 1 && input[i + 1] % 2 == 1) {
                    System.out.printf("%d, %d -> both are odd%n", input[i], input[i + 1]);
                } else {
                    System.out.printf("%d, %d -> different%n", input[i], input[i + 1]);
                }

            }
        }else{
            System.out.println("invalid length");
        }
    }
}
