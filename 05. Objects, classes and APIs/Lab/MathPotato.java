import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class MathPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] players = bf.readLine().split("\\s+");
        int n = Integer.parseInt(bf.readLine());

        ArrayDeque<String> queue = new ArrayDeque();

        for (int i = players.length-1; i >= 0; i--) {
            queue.push(players[i]);
        }
        int count = 1;
        while (queue.size()>1){
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            if (isPrime(count)) {
                System.out.println("Prime " + queue.peek());
            }
            else{
                System.out.println("Removed " + queue.poll());

            }
            count++;
        }
        System.out.println("Last is " +queue.poll());
    }

    private static boolean isPrime(int number) {

        if (number<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
