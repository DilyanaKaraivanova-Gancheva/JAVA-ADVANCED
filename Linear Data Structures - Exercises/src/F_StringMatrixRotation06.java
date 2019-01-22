import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class F_StringMatrixRotation06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] rotation = scan.nextLine().split("\\(|\\)");
        int counter = 0;
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("END")) {
                break;
            }
            words.add(input);
            counter++;
        }
        int maxLen = Integer.MIN_VALUE;
        for (String word : words) {
            if (word.length() > maxLen){
                maxLen = word.length();
            }
        }
             char[][] matrix = new char[counter][maxLen];

            for (int i = 0; i < counter; i++) {
                for (int j = 0; j < maxLen; j++) {
                    if (j >= words.get(i).length()){
                        matrix[i][j] = ' ';
                    }else {
                        matrix[i][j] = words.get(i).charAt(j);
                    }

                }

            }
            if ((Integer.parseInt(rotation[1]) % 360)/ 90 == 1){
                for (int i =0; i < maxLen; i++) {
                    for (int j = counter -1; j >= 0; j--) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }
            }else if ((Integer.parseInt(rotation[1]) % 360)/ 90 == 2){
                for (int i = counter-1; i >= 0 ; i--) {
                    for (int j = maxLen -1; j >= 0; j--) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
            }else if((Integer.parseInt(rotation[1]) % 360)/ 90 == 3){
                for (int i = maxLen-1; i >= 0 ; i--) {
                    for (int j = 0; j < counter; j++) {
                        System.out.print(matrix[j][i]);
                    }
                    System.out.println();
                }
            }else{
                for (int i = 0; i < counter ; i++) {
                    for (int j = 0; j < maxLen; j++) {
                        System.out.print(matrix[i][j]);
                    }
                    System.out.println();
                }
            }
        }
}