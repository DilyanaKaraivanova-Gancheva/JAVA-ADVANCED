import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        if (isBalanced(expression)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }

    private static boolean isBalanced(String expression) {
        ArrayDeque<Character>  parentheses = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '['){
                parentheses.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']'){
                if (!parentheses.isEmpty()){
                    char first = parentheses.pop();
                    if (first == '('){
                        if (ch != ')'){
                            return false;
                        }
                    }
                    else if (first == '{'){
                        if (ch != '}'){
                            return false;
                        }
                    }
                    else if (first == '['){
                        if (ch!=']'){
                            return false;
                        }
                    }
                }
                else{
                    return false;
                }

            }
        }
        return true;
    }
}
