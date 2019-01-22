import java.util.ArrayDeque;
        import java.util.Collections;
        import java.util.Scanner;

public class G_ReverseNumberswithStack07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length ; i++) {
            stack.push(Integer.parseInt(input[i]));
        }

        while ( stack.size() > 0){
            System.out.printf("%d ",stack.pop());
        }
    }
}
