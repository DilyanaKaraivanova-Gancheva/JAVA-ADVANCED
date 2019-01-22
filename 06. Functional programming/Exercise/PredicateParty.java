import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateParty {
    private static Predicate<String> currentPredicate;
    private static List<String> guests;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        guests = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        String[] line = scanner.nextLine().split("\\s+");
        while (!line[0].equalsIgnoreCase("party!")){
            String command = line[0];
            String option = line[1];
            String criteria = line[2];

            Predicate<String> startsWith = s -> s.startsWith(criteria);
            Predicate<String> endsWith = s -> s.endsWith(criteria);
            Predicate<String> length = s -> s.length() == Integer.parseInt(criteria);

            switch (option){
                case "StartsWith":
                    currentPredicate = startsWith;
                    break;
                case "EndsWith":
                    currentPredicate = endsWith;
                    break;
                case "Length":
                    currentPredicate = length;
                    break;
            }

            switch (command){
                case "Remove":
                    guests.removeIf(currentPredicate);
                    break;
                case "Double":
                    doubleGuest();
                    break;
            }

            line = scanner.nextLine().split("\\s+");

        }

        if (guests.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }
        else{
            System.out.println(guests.toString().replace("]", "").replace("[", "") + " are going to the party!");
        }
    }

    private static void doubleGuest() {
        for (int i = 0; i < guests.size(); i++) {
            if (currentPredicate.test(guests.get(i))){
                guests.add(i, guests.get(i));
                i++;
            }
        }
    }
}
