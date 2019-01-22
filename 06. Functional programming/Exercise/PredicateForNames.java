import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> check = s -> s.length() <= count;

        for (int i = 0; i < names.length; i++) {
            if (check.test(names[i])){
                System.out.println(names[i]);
            }
        }
    }
}
