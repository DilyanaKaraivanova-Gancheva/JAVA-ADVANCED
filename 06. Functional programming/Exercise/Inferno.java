import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public class Inferno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        HashMap<String, Predicate<Integer>> commands = new HashMap<>();

        String[] input = scanner.nextLine().split(";");

        while (!"Forge".equalsIgnoreCase(input[0])){
            Predicate<Integer> predicate = makePredicate(input,nums);

            String command = input[0];
            switch (command){
                case "Exclude":
                    commands.put(input[1] + input[2], predicate);
                    break;
                case "Reverse":
                    commands.remove(input[1] + input[2]);
                    break;
            }
            input = scanner.nextLine().split(";");
        }

        for (int i = 0; i < nums.length; i++) {
            boolean forRemove = false;

            for (Map.Entry<String,Predicate<Integer>> stringPredicateEntry : commands.entrySet()) {
                if (stringPredicateEntry.getValue().test(i)){
                    forRemove = true;
                    break;
                }
            }
            if (!forRemove){
                System.out.printf(nums[i]+ " ");
            }
        }
    }

    private static Predicate<Integer> makePredicate(String[] input, int[] nums) {
        String filterTypes = input[1];
        int value = Integer.parseInt(input[2]);

        switch (filterTypes){
            case "Sum Left":
                return index -> (index>0 ? nums[index-1] : 0) + nums[index] == value;
            case "Sum Right":
                return index -> nums[index] + (index< nums.length-1? nums[index+1]:0) == value;
            case "Sum Left Right":
                return index -> (index>0 ? nums[index-1] : 0) + nums[index] +
                        (index< nums.length-1? nums[index+1]:0) == value;
        }
        return null;
    }
}
