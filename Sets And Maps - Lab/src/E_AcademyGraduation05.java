import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E_AcademyGraduation05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        Map<String, double[]> grades = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            String name = scan.nextLine();
            double[] scores = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            grades.put(name, scores);
        }

        for (var s : grades.entrySet()) {
            double sum = 0;
            for (double nums : s.getValue()) {
                sum += nums;
            }
            sum = sum / s.getValue().length;
            System.out.printf("%s is graduated with %s%n", s.getKey(), sum);
        }
    }
}