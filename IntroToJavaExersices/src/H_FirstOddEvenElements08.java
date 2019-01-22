import java.util.Scanner;

public class H_FirstOddEvenElements08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstInput = scan.nextLine().split(" ");
        String[] secondInput = scan.nextLine().split(" ");


        int num = Integer.parseInt(secondInput[1]);
        String type = secondInput[2];
        int[] result = new int[firstInput.length];
        int counter = 1;

        for (int i = 0; i <firstInput.length ; i++) {
            result[i] = Integer.parseInt(firstInput[i]);
        }
        for ( int n: result) {
            if ("even".equals(type)) {
                if (n % 2 == 0 && counter <= num) {
                    System.out.printf("%d ",n);
                    counter++;
                }
            }else{
                if (n % 2 != 0 && counter <= num) {
                    System.out.printf("%d ",n);
                    counter ++;
                }
            }
        }
    }
}
