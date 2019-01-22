import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> chars = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            if (!chars.containsKey(current)){
                chars.put(current,1);
            }
            else{
                chars.replace(current, chars.get(current) + 1);
            }
        }

        for (Map.Entry<Character, Integer> s : chars.entrySet()) {
            System.out.println(s.getKey() + ": " + s.getValue() + " time/s");
        }

    }
}
