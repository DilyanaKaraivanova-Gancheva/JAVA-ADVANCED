import java.util.*;
import java.util.function.Predicate;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Predicate<Integer> even = n -> Math.abs(n%2) ==0;
        Predicate<Integer> odd = n -> Math.abs(n%2) ==1;

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <nums.length; i++) {
            if (even.test(nums[i])){
                result.add(nums[i]);
            }
        }
        result.sort(Comparator.naturalOrder());
        List<Integer> odds = new ArrayList<>();
        for (int i = 0; i <nums.length; i++) {
            if (odd.test(nums[i])){
                odds.add(nums[i]);
            }
        }
        odds.sort(Comparator.naturalOrder());
        result.addAll(odds);
        System.out.println(result.toString().replace("[","").replace("]","").replace(",",""));
    }
}
