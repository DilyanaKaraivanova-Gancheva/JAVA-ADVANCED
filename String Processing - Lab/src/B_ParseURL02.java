import java.util.Scanner;

public class B_ParseURL02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("://");
        if (input.length != 2) {
            System.out.println("Invalid URL");
        } else {
            String protocol = input[0];
            String server = input[1].substring(0, input[1].indexOf("/"));
            String resources = input[1].substring(input[1].indexOf("/") + 1);

            System.out.printf("Protocol = %s%n", protocol);
            System.out.printf("Server = %s%n", server);
            System.out.printf("Resources = %s%n", resources);
        }
    }
}
