import java.util.*;
import java.util.function.Function;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::valueOf).toArray();

        List<Integer> numbers = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]< min){
                min = nums[i];
            }
            numbers.add(nums[i]);
        }

        int finalMin = min;
        Function<List<Integer>, Integer> getIndex = n -> n.lastIndexOf(finalMin);

        System.out.println(getIndex.apply(numbers));
    }
}
