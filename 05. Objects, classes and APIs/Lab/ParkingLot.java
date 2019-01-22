import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> parking = new HashSet<>(0);

        String[] input = scanner.nextLine().split(", ");

        while (!input[0].equals("END")){
            if (input[0].equals("IN")){
                parking.add(input[1]);
            }
            else if (input[0].equals("OUT")){
                parking.remove(input[1]);
            }
            input = scanner.nextLine().split(", ");
        }

        if (parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        else {
            for (String car : parking
                    ) {
                System.out.println(car);
            }
        }
    }
}
