import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class K_GameofNames11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        Map<String, Integer> pairs = new LinkedHashMap<>();

        for (int i = 0; i < count ; i++) {
            String name = scan.next("\\w+");
            int score = scan.nextInt();
            for (int j = 0; j < name.length() ; j++) {
                if (name.charAt(j) % 2 == 0){
                    score += name.charAt(j);
                }else if (name.charAt(j) % 2 != 0){
                    score -= name.charAt(j);
                }
            }
            pairs.put(name,score);
        }
         Integer max = Integer.MIN_VALUE;
        String maxName = "";
        for (Map.Entry<String, Integer> p : pairs.entrySet()) {
            if (max < p.getValue()){
                max = p.getValue();
                maxName = p.getKey();
            }
        }
        System.out.printf("The winner is %s - %d points ",maxName,max);
    }
}
