import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class B_SoftUniParty02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String list = scan.nextLine();

        Set<String> guest = new TreeSet<>();

        while (!"PARTY".equals(list)) {
            guest.add(list);
            list = scan.nextLine();
        }
        String commingGests = scan.nextLine();

        while (!"END".equals(commingGests)) {
            guest.remove(commingGests);
            commingGests = scan.nextLine();
        }

        System.out.println(guest.size());

        for (String person : guest) {

            System.out.println(person);
        }
    }
}
