import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double[] nums = Arrays.stream(bf.readLine().split(", ")).mapToDouble(Double::parseDouble).toArray();

        UnaryOperator<Double> vat = x -> x*=1.2;

        System.out.println("Prices with VAT:");
        for (int i = 0; i < nums.length; i++) {
           String numToPrint = String.format("%1$.2f", vat.apply(nums[i])).replace('.',',');
            System.out.println(numToPrint);
        }
    }
}
