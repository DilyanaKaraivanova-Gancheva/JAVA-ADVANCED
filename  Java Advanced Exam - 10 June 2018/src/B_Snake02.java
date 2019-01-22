import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Snake02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(reader.readLine());
        String[] comands = reader.readLine().split(", ");

        String[][] matrix = new String[size][size];
        int snakeLength = 1;

    }
}
