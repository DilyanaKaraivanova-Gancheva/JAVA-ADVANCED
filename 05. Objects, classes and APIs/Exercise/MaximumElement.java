import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> nums = new ArrayDeque<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int command = line[0];

            switch (command){
                case 1:
                    nums.push(line[1]);
                    break;
                case 2:
                    nums.pop();
                    break;
                case 3:
                    Object[] temp = nums.toArray();
                    Arrays.sort(temp);
                    System.out.println(temp[temp.length-1]);
                    break;
            }
        }
    }
}
