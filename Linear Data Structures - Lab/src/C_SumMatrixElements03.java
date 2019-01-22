import java.util.Scanner;

public class C_SumMatrixElements03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nums = scan.nextLine().split(", ");
        int rowCount = Integer.parseInt(nums[0]);
        int colCount = Integer.parseInt(nums[1]);

        int[][] matrix = new int[rowCount][colCount];
        int sum = 0;

        for (int i = 0; i < rowCount; i++) {

            String[] filNum = scan.nextLine().split(", ");

            for (int j = 0; j < colCount; j++) {
                matrix[i][j] = Integer.parseInt(filNum[j]);
                sum += Integer.parseInt(filNum[j]);

            }
        }
        System.out.printf("%d%n",rowCount);
        System.out.printf("%d%n",colCount);
        System.out.printf("%d%n",sum);
    }
}
