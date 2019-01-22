import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class J_BasicQueueOperations10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbers = scan.nextLine().split(" ");

        int dequeSize = Integer.parseInt(numbers[0]);
        int dequePoll = Integer.parseInt(numbers[1]);
        int dequeContains = Integer.parseInt(numbers[2]);
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        String[] inputs = scan.nextLine().split( " ");

        for (int i = 0; i < dequeSize; i++) {
            deque.add(Integer.parseInt(inputs[i]));
        }
        for (int i = 0; i < dequePoll; i++) {
            deque.poll();
        }
        if (deque.contains(dequeContains)){
            System.out.println("true");
        }else if (deque.isEmpty()){
            System.out.println(0);
        } else{
             System.out.println(Collections.min(deque));
        }
    }
}