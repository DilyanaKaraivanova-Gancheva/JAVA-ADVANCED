import java.util.*;
import java.util.stream.Stream;

public class FirstName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.asList(scanner.nextLine().split(" "));
        HashSet<Character> letters = new HashSet<>();

        Stream.of(scanner.nextLine().split("\\s+")).map(s-> s.toLowerCase().charAt(0)).forEach(letters::add);

       Optional<String> name = names.stream().filter(n -> letters.contains(n.toLowerCase().charAt(0))).sorted().findFirst();

       if (name.isPresent()){
        System.out.println(name.get());
       }
       else{
           System.out.println("No match");
       }

    }
}
