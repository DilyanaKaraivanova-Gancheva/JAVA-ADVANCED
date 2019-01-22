import java.util.*;
import java.util.stream.Collectors;

public class AverageOfDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nums = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

       OptionalDouble avg = nums.stream().filter(d -> !d.isEmpty()).mapToDouble(Double::parseDouble).average();

       if (avg.isPresent()){
           System.out.printf("%.2f", avg.getAsDouble());
       }
       else{
           System.out.println("No match");
       }
    }
}
