import javafx.css.Match;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class G_ValidUsernames07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        List<String> results = new ArrayList<>();

        while (!"END".equals(line)){
            Pattern pattern = Pattern.compile("^[\\w-]{3,16}$");
            Matcher match = pattern.matcher(line);
            int counter = 0;
            if(match.find()){
               results.add("valid");
            }else{
                results.add("invalid");
            }
            line = scan.nextLine();
        }
        if (results.contains("valid")){
            for (String result : results) {
                System.out.println(result);
            }
        }
    }
}
