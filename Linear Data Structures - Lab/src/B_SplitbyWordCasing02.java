
import java.util.ArrayList;
import java.util.Scanner;

public class B_SplitbyWordCasing02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("[.!,/()'\\\\\";:\\[\\] ]+"); // "[.!,/()'\\\\\";:\\[\\] ]+"
// Learn programming at SoftUni: Java, PHP, JS, HTML 5, CSS, Web, C#, SQL, databases, AJAX, etc.
        ArrayList<String> lower = new ArrayList<>();
        ArrayList<String> upper = new ArrayList<>();
        ArrayList<String> mixed = new ArrayList<>();

        for (String word : input) {
            if (word.isEmpty()){
              continue;
            }
            boolean isMixed = false;
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isLetter(word.charAt(i))){
                   mixed.add(word);
                   isMixed = true;
                   break;
                }
            }
            if (!isMixed) {
                if (word.toLowerCase().equals(word)) {
                    lower.add(word);
                } else if (word.toUpperCase().equals(word)) {
                    upper.add(word);
                } else {
                    mixed.add(word);
                }
            }
        }
        System.out.println("Lower-case: " + String.join(", ",lower));
        System.out.println("Mixed-case: "+ String.join(", ",mixed));
        System.out.println("Upper-case: " + String.join(", ",upper));

    }
}
