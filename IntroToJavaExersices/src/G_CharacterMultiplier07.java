import java.util.Arrays;
import java.util.Scanner;

public class G_CharacterMultiplier07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.next("\\w+");
        String second = scan.next("\\w+");

        int maxLen = Math.max(first.length(), second.length());
        int totalresult = 0;

        for (int i = 0; i < maxLen ; i++) {
            if (i >= first.length()){
                totalresult += second.charAt(i);
            }else if (i >= second.length()){
                totalresult += first.charAt(i);
            }else {
                totalresult += first.charAt(i) * second.charAt(i);
            }

        }
        System.out.println((totalresult));
    }
}
