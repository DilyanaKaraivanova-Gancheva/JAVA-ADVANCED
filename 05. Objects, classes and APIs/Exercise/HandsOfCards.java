import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, HashSet<String>> cards = new LinkedHashMap<>();

        String[] line = scanner.nextLine().split(": ");

        while (!line[0].equals("JOKER")){
            String name = line[0];
            String[] deck = line[1].split(", ");
            HashSet<String> cardsDeck = new HashSet<>();
            cardsDeck.addAll(Arrays.asList(deck));

            if (!cards.containsKey(name)){
                cards.put(name, cardsDeck);
            }
            else{
                for (String uniqueCard:cardsDeck) {
                    cards.get(name).add(uniqueCard);
                }
            }

            line = scanner.nextLine().split(": ");
        }

        for (String s:cards.keySet()) {
            int sum = sumCards(cards.get(s));

            System.out.printf("%s: %d%n", s, sum);
        }
    }

    private static int sumCards(HashSet<String> cardsDeck) {
        int sum = 0;

        for (String card: cardsDeck) {
            String power = "";
            Character type;
            if (card.length()>2){
                power = card.substring(0,2);
                type = card.charAt(2);
            }
            else {
                power = card.substring(0,1);
                type = card.charAt(1);
            }
            int powers = 0;
            int typePower = 0;

            switch (power){
                case "J":
                    powers = 11;
                    break;
                case "Q":
                    powers = 12;
                    break;
                case "K":
                    powers = 13;
                    break;
                case "A":
                    powers = 14;
                    break;
                    default:
                        powers = Integer.parseInt(power);
                        break;
            }

            switch (type){
                case 'S':
                   typePower = 4;
                   break;
                case 'H':
                    typePower = 3;
                    break;
                case 'D':
                    typePower = 2;
                    break;
                case 'C':
                    typePower = 1;
                    break;
            }

            sum += typePower * powers;

        }
        return sum;
    }
}
