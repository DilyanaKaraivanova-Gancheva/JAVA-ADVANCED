import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.nextLine();

        ArrayDeque<Integer> nums = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }
        for (int i = 0; i < s; i++) {
            nums.remove();
        }
        if (nums.isEmpty()){
            System.out.println(0);
            return;
        }
        if (nums.contains(x)){
            System.out.println("true");
        }
        else{
           Object[] temp =  nums.toArray();
           Arrays.sort(temp);
            System.out.println(temp[0]);
        }
    }
}
