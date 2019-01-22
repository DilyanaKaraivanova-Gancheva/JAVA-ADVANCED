import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\s+");
 
        Predicate<String> isUppercase = b -> b.charAt(0) == b.toUpperCase().charAt(0);

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < text.length; i++) {
            if(isUppercase.test(text[i])){
                result.add(text[i]);
            }
        }

        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
