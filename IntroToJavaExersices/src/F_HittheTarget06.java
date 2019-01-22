import java.util.Scanner;

public class F_HittheTarget06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int target = scan.nextInt();

        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <=20 ; j++) {
                int sum = i + j;
                int divisor = i-j;
                if ((sum == target )){
                    System.out.printf("%d + %d = %d\n",i,j,sum);
                }else if (divisor == target){
                    System.out.printf("%d - %d = %d\n",i,j,divisor);
                }
            }

        }

    }
}
