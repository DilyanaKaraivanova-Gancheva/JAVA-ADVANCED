import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class H_HotPotato08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int num = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> deque = new ArrayDeque<>();
        Collections.addAll(deque, input);
        int counter = 0;

        while (deque.size() > 1) {

            String currentKid = deque.poll();
            counter++;
            if (counter == num) {
                System.out.printf("Removed %s\n", currentKid);
                counter = 0;
            } else {
                deque.add(currentKid);
            }
        }
        System.out.printf("Last is %s%n", deque.poll());


    }
}
