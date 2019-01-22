import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;


public class FindAndSumIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Optional<Integer> sum = Arrays.stream(input).filter(FindAndSumIntegers::isNumber).map(Integer::valueOf)
                .reduce((x1, x2) -> x1 + x2);

        if (sum.isPresent()){
            System.out.println(sum.get());
        }
        else{
            System.out.println("No match");
        }
    }

        public static boolean isNumber(String x) {
          return  x.matches("-?\\d+");
        }
    }

