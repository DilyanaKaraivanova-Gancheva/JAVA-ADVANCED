import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A_UniqueUsernames01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        Set<String> names = new LinkedHashSet();

        for (int i = 0; i < num; i++) {
            names.add(scan.nextLine());

        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
