import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class E_SimpleCalculator05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque();
        String[] input = scan.nextLine().split(" ");
        Collections.addAll(stack,input);
        int result =0;

      while (stack.size() > 1) {
            int first = Integer.valueOf( stack.pop());
            String operand = stack.pop();
            int second = Integer.valueOf(stack.pop());

            if ("-".equals(operand)){
                result = first - second;
                stack.push(String.valueOf(result));
            }else if ("+".equals(operand)){
                result = first + second;
                stack.push(String.valueOf(result));
            }

        }
        System.out.println(stack.pop());
    }
}
