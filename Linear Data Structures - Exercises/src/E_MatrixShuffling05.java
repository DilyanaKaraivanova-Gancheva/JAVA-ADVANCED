
import java.util.Scanner;

public class E_MatrixShuffling05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] tokens = scan.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = tokens[j];
            }
        }

        while (true){
            String[] commands = scan.nextLine().split(" ");

            if (commands[0].equals("END")){
                break;
            }
            if (!commands[0].equals("swap") && commands.length != 5){
                System.out.println("Invalid input!");
            }else{
                try {
                    int row1 = Integer.parseInt(commands[1]);
                    int coL1 = Integer.parseInt(commands[2]);
                    int row2 = Integer.parseInt(commands[3]);
                    int col2 = Integer.parseInt(commands[4]);

                    String oldNum = matrix[row1][coL1];
                    matrix[row1][coL1] = matrix[row2][col2];
                    matrix[row2][col2] = oldNum;
                    for (String[] row : matrix) {
                        for (String col : row) {
                            System.out.print(col + " ");
                        }
                        System.out.println();
                    }
                }catch (Exception a){
                    System.out.println("Invalid input!");
                }

            }
        }
    }
}
