import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String[] input = scanner.nextLine().split("-");

        while (!input[0].equals("search")){
            String name = input[0];
            String number = input[1];

            phonebook.put(name,number);

            input = scanner.nextLine().split("-");
        }

        while (true){
            String nameToFind = scanner.nextLine();
            if (nameToFind.equals("stop")){
                break;
            }
            if (!phonebook.containsKey(nameToFind)){
                System.out.printf("Contact %s does not exist.%n", nameToFind);
            }
            else{
                System.out.printf("%s -> %S%n", nameToFind, phonebook.get(nameToFind));
            }

        }
    }
}
