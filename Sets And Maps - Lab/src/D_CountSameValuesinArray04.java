import java.util.*;

public class D_CountSameValuesinArray04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String,Integer> countOccurance = new HashMap<>();

        String[] input = scan.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            if (!countOccurance.containsKey(input[i])){
                countOccurance.put(input[i],1);
            }else{
                countOccurance.put(input[i],countOccurance.get(input[i]) + 1);
            }

        }
        for (String key : countOccurance.keySet()) {
            System.out.printf("%s - %d times%n",key,countOccurance.get(key));
        }
    }
}
