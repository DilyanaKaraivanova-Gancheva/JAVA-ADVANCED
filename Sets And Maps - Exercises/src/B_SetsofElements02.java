import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class B_SetsofElements02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Set<Integer> first = new LinkedHashSet();
        Set<Integer> second = new LinkedHashSet();

        for (int i = 0; i < n; i++) {
            int inputFirst = Integer.parseInt(scan.nextLine());
            first.add(inputFirst);
        }
        for (int i = 0; i < m ; i++) {
            int inputSecond = Integer.parseInt(scan.nextLine());
            second.add(inputSecond);
        }
        Set<Integer> repeated = new LinkedHashSet<>();

            repeated.addAll(first);
            repeated.addAll(second);

            //first.retainAll(second);

        for (Integer num : repeated) {
            if (first.contains(num) && second.contains(num)){
                System.out.printf("%d ",num);
            }

        }
    }
}
