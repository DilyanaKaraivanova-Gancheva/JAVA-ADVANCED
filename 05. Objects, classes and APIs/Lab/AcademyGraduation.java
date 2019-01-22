import javax.print.DocFlavor;
import java.math.BigDecimal;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, double[]> avgScore = new TreeMap<>();

        for (int i = 0; i < count; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

            avgScore.put(name, grades);
        }

        for (Map.Entry<String, double[]> student :
            avgScore.entrySet() ) {
            double[] avg = student.getValue();
            double sum = 0;
            for (int i = 0; i < avg.length; i++) {
                sum += avg[i];
            }
            sum /= avg.length;

            System.out.printf("%s is graduated with %s", student.getKey(), String.valueOf(sum));
            System.out.println();
        }
    }
}
