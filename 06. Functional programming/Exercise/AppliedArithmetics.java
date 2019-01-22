import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        Function<Integer, Integer> add = n -> n+1;
        Function<Integer, Integer> multiply = n -> n*2;
        Function<Integer, Integer> subtract = n -> n-1;
        Consumer<Integer> print = n -> System.out.print(n + " ");

        while (!command.equalsIgnoreCase("end")){
            for (int i = 0; i < nums.length; i++) {
                switch (command){
                    case "add":
                       nums[i] = add.apply(nums[i]);
                        break;
                    case "multiply":
                        nums[i] = multiply.apply(nums[i]);
                        break;
                    case "subtract":
                        nums[i] = subtract.apply(nums[i]);
                        break;
                    case "print":
                        print.accept(nums[i]);
                        break;
                }
            }
            if (command.equalsIgnoreCase("print")){
                System.out.println();
            }

            command = scanner.nextLine();
        }
    }
}
