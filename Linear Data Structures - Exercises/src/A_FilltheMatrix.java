import java.util.Scanner;

public class A_FilltheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        int num = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[num][num];

        if ("A".equals(pattern)) {

            fillMatrixA(num, matrix);
        }else{
            fillMatrixB(num, matrix);
        }
        PrintMatrix(matrix);
    }

    private static void PrintMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int cols : rows) {
                System.out.printf("%d ",cols);
            }
            System.out.println();

        }
    }

    private static void fillMatrixB(int num, int[][] matrix) {
        int counter = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i % 2 == 0) {
                    matrix[j][i] = counter;
                }else{
                    matrix[num - j -1][i] = counter;
                }
                counter++;
            }
        }
    }

    private static void fillMatrixA(int num, int[][] matrix) {
        for (int i = 0; i < num; i++) {
            int counter = i;
            counter ++;

            for (int j = 0; j < num  ; j++) {
                matrix[i][j] = counter;
                counter += num;
            }
        }
    }
}
