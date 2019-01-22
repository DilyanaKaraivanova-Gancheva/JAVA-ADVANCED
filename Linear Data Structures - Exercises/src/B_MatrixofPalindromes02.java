import java.util.Scanner;

public class B_MatrixofPalindromes02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row = Integer.parseInt(scan.next());
        int col = Integer.parseInt(scan.next());

        String[][] matrix = new String[row][col];

        fillMatrix(row, col, matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] chars : matrix) {
            for (String aChar : chars) {
                System.out.printf("%s ", aChar);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int row, int col, String[][] matrix) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                matrix[i][j] = String.format("%s%s%s",alphabet[i],alphabet[i + j],alphabet[i]);
            }
        }
    }
}
