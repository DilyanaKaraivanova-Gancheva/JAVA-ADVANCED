import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormattingNumbers03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer a = Integer.parseInt(reader.readLine());
        Double b = Double.parseDouble(reader.readLine());
        Double c= Double.parseDouble(reader.readLine());

        System.out.printf("|%-10d|%010d|",a,Integer.toBinaryString(a));
    }
}
