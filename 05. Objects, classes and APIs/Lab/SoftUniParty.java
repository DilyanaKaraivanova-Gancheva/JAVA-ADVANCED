
import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")){
            char firstChar = input.charAt(0);

            if (Character.isDigit(firstChar) && input.length() == 8){
                vip.add(input);
            }
            else if (!Character.isDigit(firstChar) && input.length() == 8){
                regular.add(input);
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("END")){
            char firstChar = input.charAt(0);
            if(Character.isDigit(firstChar)){
                vip.remove(input);
            }
            else {
                regular.remove(input);
            }

            input = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        if (!vip.isEmpty()) {
            for (String guest: vip) {
                System.out.println(guest);
            }
        }
        if (!regular.isEmpty()) {
            for (String guest: regular) {
                System.out.println(guest);
            }
        }
    }
}
