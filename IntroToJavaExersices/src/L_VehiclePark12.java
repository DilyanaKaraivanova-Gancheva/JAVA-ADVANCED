import java.util.Arrays;
import java.util.Scanner;

public class L_VehiclePark12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String[] inputs = scan.nextLine().split("\\s+");

         while (true){
              String[] tokens = scan.nextLine().split("\\s+");
              if ("End of customers!".equals(tokens)){
                  break;
              }
              String vehicle = tokens[0];
              String numberOfSeats = tokens[2];

              if ("Bus".equals(vehicle)){
                  for (int i = 0; i <inputs.length ; i++) {
                      if (inputs[i].contains("b") && inputs[i].contains(numberOfSeats)){
                          int price = 'b' * Integer.parseInt(numberOfSeats);
                          System.out.printf("Yes, sold for %d$\n",price);
                      }
                      else{
                          System.out.println("No");
                      }
                  }

              }else if ("Car".equals(vehicle)){

              }else if ("Van".equals(vehicle)){

              }
         }
    }
}
