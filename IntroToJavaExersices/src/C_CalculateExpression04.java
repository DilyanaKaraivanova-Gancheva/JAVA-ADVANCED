import java.util.Scanner;

public class C_CalculateExpression04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double f1 = Math.pow((((a*a) + (b * b)) / ((a * a) - (b*b))),((a + b + c) / Math.sqrt(c)));
        double f2 = Math.pow(((a*a) + (b * b) - (c * c * c)),(a - b));

        double diffAbc = (a + b + c) /3;
         double diffF1f2 = (f1 + f2) / 2;
         double totalDiff = Math.abs(diffAbc - diffF1f2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1,f2,totalDiff);

    }
}
