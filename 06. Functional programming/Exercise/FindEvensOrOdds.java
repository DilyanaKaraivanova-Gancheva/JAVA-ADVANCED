import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        scanner.nextLine();
        String type = scanner.nextLine();

        printNumbers(start, end, type);
    }

    private static void printNumbers(int start, int end, String type) {
        Function<String, Integer> evenOrOdd = s -> s.equalsIgnoreCase("even")? 0:1;
        int del = evenOrOdd.apply(type);

        Predicate<Integer> isEven = number -> Math.abs(number%2) == del;

        for (int i = start; i <=end ; i++) {
            if (isEven.test(i)){
                System.out.printf(i+" ");
            }
        }
    }
}
