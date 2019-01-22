import java.math.BigInteger;
import java.util.Scanner;

public class ProductofNumbers07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        BigInteger num = new BigInteger("1");

        for (int i = start; i <= end ; i++) {
            BigInteger result = new BigInteger("" + i);
            num = num.multiply(result);

        }

        System.out.printf("product[%d..%d] = %d",start,end,num);
    }
}
