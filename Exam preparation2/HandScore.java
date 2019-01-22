import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HandScore {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<String> cards = Arrays.stream(bf.readLine().split("\\s+")).collect(Collectors.toList());

        int result = 0;
        int tempValue = 0;
        int cnt = 0;

        for(int i = 0; i< cards.size();i++) {
            String suit = cards.get(i).substring(cards.get(i).length()-1);
            String power = cards.get(i).substring(0, cards.get(i).length()-1);

            int powerValue = checkPower(power);
            if (i == cards.size()-1){
                if (tempValue!=0) {
                    result += (powerValue + tempValue) * ++cnt;
                }
                else{
                    result += powerValue;
                }
                break;
            }
            String nextSuit = cards.get(i+1).substring(cards.get(i+1).length()-1);

            if (suit.equalsIgnoreCase(nextSuit)){
                tempValue += powerValue;
                cnt++;
            }
            else{
                if (tempValue != 0){
                    result += ((powerValue +tempValue) * ++cnt);
                    tempValue = 0;
                    cnt = 0;
                }
                else {
                    result += powerValue;
                }
            }

        }
        System.out.println(result);
    }

    private static int checkPower(String power) {
        int powerValue = 0;
        switch (power){
            case"J":
                powerValue = 12;
                break;
            case"Q":
                powerValue = 13;
                break;
            case"K":
                powerValue = 14;
                break;
            case"A":
                powerValue = 15;
                break;
            default:
                powerValue = Integer.valueOf(power);
                break;
        }
        return powerValue;
    }
}
