import java.util.Collections;
import java.util.Scanner;

public class C_DiagonalDifference03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        Integer[][] matrix = new Integer[size][size];
        int sumRight = 0;
        int sumLeft = 0;

        for (int i = 0; i < size; i++) {
            String[] input = scan.nextLine().split(" ");
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            sumLeft += matrix[i][i];
            sumRight += matrix[i][size - 1];
            size--;
        }
        System.out.println(Math.abs(sumLeft - sumRight));

    }
}
