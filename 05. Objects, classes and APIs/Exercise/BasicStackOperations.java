import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.nextLine();

        ArrayDeque<Integer> nums = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            nums.push(scanner.nextInt());
        }
        for (int i = 0; i < s; i++) {
            nums.pop();
        }
        if (nums.isEmpty()){
            System.out.println(0);
            return;
        }
        if (nums.contains(x)){
            System.out.println("true");
        }
        else{
            Arrays.sort(nums.toArray());
            System.out.println(nums.getFirst());
        }


    }
}
