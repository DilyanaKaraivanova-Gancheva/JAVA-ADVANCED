import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E_VowelCount05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("[AOEUIYaoeuiy]");
        Matcher matcher = pattern.matcher(input);

        int counter = 0;

        while (matcher.find()){
            counter++;
        }
        System.out.println("Vowels: " + counter);
    }
}
