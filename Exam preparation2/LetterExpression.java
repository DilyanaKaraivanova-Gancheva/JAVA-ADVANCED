import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterExpression {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("(?<number>\\d+)");
        String input = bf.readLine();
        Matcher matcher = pattern.matcher(input);
        int sum = 0;
        while (matcher.find()){
            String match = matcher.group("number");
            int num = Integer.valueOf(match);
            int substringLength = input.indexOf(match);
            if (substringLength % 2 == 0) {
                sum += num;
            } else {
                sum -= num;
            }
            input = input.substring(input.indexOf(match) + match.length());
            matcher = pattern.matcher(input);
        }
        System.out.println(sum);
    }
}
