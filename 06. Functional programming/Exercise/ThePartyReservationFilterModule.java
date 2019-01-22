import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ThePartyReservationFilterModule {
    private static List<String> invitations;
    private static Predicate<String> currentPredicate;
    private static List<String> toRemove = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        invitations = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        while (true){
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("Print")){
                break;
            }
            String[] commands = line.split(";");
            String command = commands[0];
            String filterType = commands[1];
            String criteria = commands[2];

            Predicate<String> startsWith = s -> s.startsWith(criteria);
            Predicate<String> endsWith = s -> s.endsWith(criteria);
            Predicate<String> contains = s -> s.contains(criteria);
            Predicate<String> length = s -> s.length() == Integer.parseInt(criteria);

            switch (filterType){
                case "Starts with":
                    currentPredicate = startsWith;
                    break;
                case "Ends with":
                    currentPredicate = endsWith;
                    break;
                case "Length":
                    currentPredicate = length;
                    break;
                case "Contains":
                    currentPredicate = contains;
                    break;
            }

            switch (command){
                case "Add filter":
                    addToRemove();
                    break;
                case "Remove filter":
                    toRemove.removeIf(currentPredicate);
                    break;
            }

        }
        invitations.removeAll(toRemove);
        System.out.println(invitations.toString().replace("[", "").replace("]", "")
        .replace(",", ""));

    }

    private static void addToRemove() {
        for (String invitation : invitations) {
            if (currentPredicate.test(invitation)){
                toRemove.add(invitation);
            }

        }
    }
}
