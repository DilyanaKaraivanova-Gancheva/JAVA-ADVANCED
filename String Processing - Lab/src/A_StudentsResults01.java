import java.util.Scanner;

public class A_StudentsResults01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("[,\\-\\s]+");
        System.out.println("Name      |   JAdv|JavaOOP| AdvOOP|Average|");

        double avg = (Double.parseDouble(input[1]) + Double.parseDouble(input[2]) + Double.parseDouble(input[3]))/3;
        System.out.printf("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",input[0],Double.parseDouble(input[1]),Double.parseDouble(input[2]),
                Double.parseDouble(input[3]),avg);
    }
}