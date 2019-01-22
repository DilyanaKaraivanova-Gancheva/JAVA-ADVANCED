import java.util.Scanner;

public class C_FormattingNumbers03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|",Integer.toHexString(num1).toUpperCase(),
                Integer.parseInt(Integer.toBinaryString((num1))), num2,num3);

    }
}
