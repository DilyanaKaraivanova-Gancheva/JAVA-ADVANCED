import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class D_CountSymbols04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Map<Character,Integer> countLetters = new TreeMap<>();

        for (int i = 0; i <input.length() ; i++) {
                char key = input.charAt(i);
                if (!countLetters.containsKey(key)) {
                    countLetters.put(key, 1);
                }else{
                    countLetters.put(key,countLetters.get(key) + 1);
                }
        }
        for (Character character : countLetters.keySet()) {
            System.out.printf("%s: %d time/s%n",character,countLetters.get(character));
        }
    }
}
