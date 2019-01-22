import java.io.BufferedReader;
import java.util.Scanner;

public class A_CountSubstringOccurrences01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String value = scan.nextLine();
        int counter = 0;

        for (int i = 0; i < input.length() - value.length() +1 ; i++) {
            if (input.substring(i,i + value.length()).equalsIgnoreCase(value)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
