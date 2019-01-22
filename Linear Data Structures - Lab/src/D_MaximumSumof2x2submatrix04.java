import java.util.Scanner;

public class D_MaximumSumof2x2submatrix04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String[] input = scan.nextLine().split(", ");
        int rowCount = Integer.parseInt(input[0]);
        int colCount = Integer.parseInt(input[1]);

        int[][] matrix = new int[rowCount][colCount];
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < rowCount; i++) {
            String[] fillNum = scan.nextLine().split(", ");
            for (int j = 0; j < colCount ; j++) {
                matrix[i][j] = Integer.parseInt(fillNum[j]);
            }
        }
        int[][] maxMatrix = new int[2][2];
        int maxNum1 = 0;
        int maxNum2 = 0;
        int maxNum3 = 0;
        int maxNum4 = 0;

        for (int i = 0; i < rowCount -1; i++) {
            for (int j = 0; j < colCount-1 ; j++) {
                currentSum = matrix[i][j] + matrix[i][j +1] + matrix[i +1][j] + matrix[i + 1][j +1];
                if (currentSum > maxSum){
                    maxSum = currentSum;
                    maxNum1 = matrix[i][j];
                    maxNum2 = matrix[i][j +1];
                    maxNum3 = matrix[i +1][j];
                    maxNum4 = matrix[i + 1][j +1];
                }
            }
        }
        System.out.printf("%d %d%n",maxNum1,maxNum2);
        System.out.printf("%d %d%n",maxNum3,maxNum4);
        System.out.printf("%d",maxSum);
    }
}
