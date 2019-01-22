import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F_ExtractTags06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        while (!"END".equals(line)){
            Pattern pattern = Pattern.compile("<.*?>");
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()){
                System.out.println(matcher.group());
            }
            line = scan.nextLine();
        }
    }
}
