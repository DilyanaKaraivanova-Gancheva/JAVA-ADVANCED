import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RectangleArea01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        System.out.printf("%.2f",a*b);
    }
}
