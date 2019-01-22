import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class H_BasicStackOperations08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] numbers = scan.nextLine().split("\\s+");

        for (int i = 0; i < Integer.parseInt(input[0]); i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < Integer.parseInt(input[1]); i++) {
            stack.pop();
        }

        if (stack.contains((input[2]))) {
            System.out.println(true);
        } else {
            if (stack.size() > 0) {
                System.out.println(Collections.min(stack));
            } else {
                System.out.println(0);
            }
        }
    }
}
