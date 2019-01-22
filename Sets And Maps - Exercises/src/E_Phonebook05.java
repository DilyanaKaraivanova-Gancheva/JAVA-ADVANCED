import java.util.*;

public class E_Phonebook05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();

        while (true) {
            String[] input = scan.nextLine().split("-");

            if ("search".equals(input[0])) {
                break;
            }
            String name = input[0];
            String phoneNumber = input[1];
            phonebook.put(name, phoneNumber);
        }
        while (true) {
            String searchingName = scan.nextLine();
            if ("stop".equals(searchingName)){
                break;
            }
            if (phonebook.containsKey(searchingName)) {
                System.out.printf("%s -> %s%n", searchingName, phonebook.get(searchingName));
            } else {
                System.out.printf("Contact %s does not exist.%n", searchingName);
            }
        }

    }
}
