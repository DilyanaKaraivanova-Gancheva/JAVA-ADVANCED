import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitRoller {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long number = Long.parseLong(bf.readLine());
        int index = Integer.parseInt(bf.readLine());
        int cycles = Integer.parseInt(bf.readLine());

        long frozenValue = (number >> index) & 1L;

        for (int i = 0; i < cycles; i++) {
            long firstBitValue = number & 1L;
            number >>= 1;
            if (index!=0) {
                number = setBitValue(number, firstBitValue, 18);
            }

            long jumpBitValue = (number >> index) & 1L;
            number = setBitValue(number, jumpBitValue, index-1);
            number = setBitValue(number, frozenValue, index);
        }
        System.out.println(number);
        
    }

    private static long setBitValue(long number, long bitValue, int index) {
        if (bitValue == 1){
            number |= 1<<index;
        } else {
            number &= ~(1<<index);
        }
        return number;
    }
}
