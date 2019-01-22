import java.util.Scanner;

public class Lottery08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <=10 ; i++) {
            for (int j = i + 1; j <=10 ; j++) {
                for (int k = j+1; k <=10 ; k++) {
                    System.out.printf("%d %d %d%n",i,j,k);
                }
            }
        }
    }
}
