import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class TheStockSpanProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(bf.readLine());
        }

        Deque<Integer> stock = new ArrayDeque<>();
        stock.push(0);
        StringBuilder builder = new StringBuilder();
        builder.append(1).append("\n");
        for (int i = 1; i < n; i++) {
            while (!stock.isEmpty() && prices[stock.peek()] <= prices[i]) {
                stock.pop();
            }
            if (!stock.isEmpty()) {
                builder.append(i - stock.peek()).append("\n");
            } else {
                builder.append(i + 1).append("\n");
            }
            stock.push(i);
        }

        System.out.println(builder.toString());
    }
}
