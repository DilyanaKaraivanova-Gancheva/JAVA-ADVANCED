import java.math.BigInteger;
import java.util.Scanner;

public class BitFlipper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger number = new BigInteger(scanner.nextLine());
        BigInteger ones = new BigInteger("7");
        BigInteger zeroes = new BigInteger("0");

        for (int i = 0; i <= 61; i++) {
            BigInteger threeDigits = number.shiftRight(61-i).and(ones);
            System.out.println(number.shiftRight(61-i));
            if (threeDigits.equals(ones) || threeDigits.equals(zeroes)){
                number = number.xor(ones.shiftLeft(61-i));
                i+=2;
            }
        }
        System.out.println(number);
    }
}
