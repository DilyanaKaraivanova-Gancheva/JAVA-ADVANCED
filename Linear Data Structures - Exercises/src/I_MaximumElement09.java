import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class I_MaximumElement09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int num = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < num ; i++) {
            String[] comands = scan.nextLine().split(" ");
            if (comands.length == 2){
                stack.push(Integer.parseInt(comands[1]));
            }else if ("2".equals(comands[0])){
                stack.pop();
            }else if ("3".equals(comands[0])){
                System.out.println(Collections.max(stack));
            }
        }
    }
}
