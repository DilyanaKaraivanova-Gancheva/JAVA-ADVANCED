import java.util.ArrayDeque;
import java.util.Scanner;

public class F_DecimaltoBinaryConverter06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Long> stack = new ArrayDeque<>();
        long num = Long.parseLong(scan.nextLine());
        if (num == 0){
            System.out.println(0);

        }else {

            while (num > 0) {
                stack.push(num % 2);
                num /= 2;
            }
            while (stack.size() > 0) {
                System.out.print(stack.pop());
            }
        }
    }
}
