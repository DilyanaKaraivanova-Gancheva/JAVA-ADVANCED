import java.util.*;

public class H_HandsOfCards08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String,Set<String>> hands = new LinkedHashMap<>();

        while (true){
            String[] input = scan.nextLine().split(": ");
            String name = input[0];

            if ("JOKER".equals(name)){
                break;
            }

            String[] cards = input[1].split(", ");
            Set<String> uniqueCards = new HashSet<>();
            Collections.addAll(uniqueCards, cards);

            if (!hands.containsKey(name)){
                hands.put(name,uniqueCards);
            }else{
                for (String uniqueCard : uniqueCards) {
                    if (!hands.get(name).contains(uniqueCard)){
                        hands.get(name).add(uniqueCard);
                    }
                }
            }
        }
        for (String s : hands.keySet()) {
            int score = 0;
            for (String uniqueCard : hands.get(s)) {


                char powerOfCard =uniqueCard.charAt(0);
                char typeOfCard = uniqueCard.charAt(uniqueCard.length()-1);

                if (powerOfCard == 'J'){
                    powerOfCard = 11;
                }else if(powerOfCard == 'Q'){
                    powerOfCard = 12;
                }else if(powerOfCard == 'K'){
                    powerOfCard = 13;
                }else if(powerOfCard == 'A'){
                    powerOfCard = 14;
                }else if (powerOfCard == '1'){
                    powerOfCard = 10;
                }else if (powerOfCard == '2'){
                    powerOfCard = 2;
                }else if (powerOfCard == '3'){
                    powerOfCard = 3;
                }else if (powerOfCard == '4'){
                    powerOfCard = 4;
                }else if (powerOfCard == '5'){
                    powerOfCard = 5;
                }else if (powerOfCard == '6'){
                    powerOfCard = 6;
                }else if (powerOfCard == '7'){
                    powerOfCard = 7;
                }else if (powerOfCard == '8'){
                    powerOfCard = 8;
                }else if (powerOfCard == '9'){
                    powerOfCard = 9;
                }

                if (typeOfCard == 'S'){
                    typeOfCard = 4;
                }else if (typeOfCard == 'H'){
                    typeOfCard = 3;
                }else if (typeOfCard == 'D'){
                    typeOfCard = 2;
                }else if (typeOfCard == 'C'){
                    typeOfCard = 1;
                }

                score += powerOfCard * typeOfCard;
            }
            System.out.printf("%s: %s%n",s,score);
        }
    }
}
