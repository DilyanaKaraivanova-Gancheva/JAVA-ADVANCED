import java.util.Scanner;

public class TriangleArea02 {//100/100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer x1 = scanner.nextInt();
        Integer y1 = scanner.nextInt();
        scanner.nextLine();

        Integer x2 = scanner.nextInt();
        Integer y2 = scanner.nextInt();
        scanner.nextLine();

        Integer x3 = scanner.nextInt();
        Integer y3 = scanner.nextInt();
        scanner.nextLine();

        Integer area = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3*(y1 - y2))/2;
        System.out.println(Math.abs(area));

    }
}
