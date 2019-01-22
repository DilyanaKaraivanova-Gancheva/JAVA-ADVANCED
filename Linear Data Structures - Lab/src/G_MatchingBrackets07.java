import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class G_MatchingBrackets07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length() ; i++) {
            char index = input.charAt(i);
            if (index == '('){
                stack.push(i);
            }else if (index == ')'){
               int startIndex = stack.pop();
                String contents = input.substring(startIndex,i + 1);
                System.out.println(contents);
            }
        }
    }
}
