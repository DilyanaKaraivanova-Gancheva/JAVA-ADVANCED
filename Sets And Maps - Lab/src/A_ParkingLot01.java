import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_ParkingLot01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        Set<String> cars = new HashSet<>();

        while (!"END".equals(input[0])) {

            String entrace = input[0];
            String carNumber = input[1];
            if ("IN".equals(entrace)) {
                cars.add(carNumber);
            } else {
                cars.remove(carNumber);
            }
            input = scan.nextLine().split(", ");
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}
