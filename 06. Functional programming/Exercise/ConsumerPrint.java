import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String> printNames = s -> System.out.println(s);

        for (int i = 0; i < names.length; i++) {
            printNames.accept(names[i]);
        }
    }
}
