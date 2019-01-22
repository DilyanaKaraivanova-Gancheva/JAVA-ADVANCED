import java.util.Scanner;

public class TransportPrice05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double distance = Double.valueOf(scan.nextLine());
        String partOfDay = scan.nextLine();
        double price = 0.0;

        if ( distance < 20){
            if ("day".equals(partOfDay)) {
                price = distance * 0.79 + 0.7;
            }else {
                price = distance * 0.9 + 0.7;
            }
        }else if (distance < 100){
            price = distance * 0.09;
        }else {
            price = distance * 0.06;
        }
        System.out.printf("%.2f",price);

    }
}
