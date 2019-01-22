import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque<Integer> brackets = new ArrayDeque();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '('){
                brackets.push(i);
            }
            else if (expression.charAt(i) == ')'){
               int startIndex = brackets.pop();
               String content = expression.substring(startIndex, i+1);
                System.out.println(content);
            }
        }

    }
}
