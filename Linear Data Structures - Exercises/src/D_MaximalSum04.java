import java.util.Scanner;

public class D_MaximalSum04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sizes = scan.nextLine().split(" ");

        int rows = Integer.parseInt(sizes[0]);
        int cols = Integer.parseInt(sizes[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows ; i++) {
            String[] input = scan.nextLine().split(" ");
            for (int j = 0; j < cols ; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        int bestSum =Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int i = 0; i < rows -2; i++) {
            for (int j = 0; j < cols -2; j++) {
                 int sum = getSum(matrix, i, j);

                if ( sum > bestSum){
                    bestSum = sum;
                    bestRow = i;
                    bestCol = j;
                }

            }
        }
        System.out.printf("Sum = %d%n",bestSum);
        for (int i = bestRow; i < bestRow + 3 ; i++) {
            for (int j = bestCol; j < bestCol + 3; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }

    }

    private static int getSum(int[][] matrix, int i, int j) {
        int currentSum = 0;
        for (int k = i; k < i + 3; k++) {
            for (int l = j; l < j +3 ; l++) {
                currentSum += matrix[k][l];
            }
        }
        return currentSum;
    }
}
