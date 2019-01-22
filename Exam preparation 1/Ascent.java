import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascent {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("(?<symbol>[_|,])(?<match>[a-zA-Z]+)(?<digit>\\d)");
        LinkedHashMap<String, String> oldMatches = new LinkedHashMap<>();
        String line = bf.readLine();

        while (!"Ascend".equalsIgnoreCase(line)){
            line = replaceOldMatches(line, oldMatches);
            Matcher match = pattern.matcher(line);

            while(match.find()){
                StringBuilder result = new StringBuilder();
                Character symbol = match.group("symbol").charAt(0);
                String message = match.group("match");
                int num =Integer.valueOf(match.group("digit"));
                if (symbol == ','){
                    for (char c : message.toCharArray()) {
                        result.append((char)(c+num));
                    }
                }
                else{
                    for (char c : message.toCharArray()) {
                        result.append((char)(c-num));
                    }
                }
                line = line.replace(match.group(), result);
                oldMatches.put(match.group(), result.toString());
            }
            System.out.println(line);
            line = bf.readLine();

        }

    }

    private static String replaceOldMatches(String line, LinkedHashMap<String, String> oldMatches) {
        for (Map.Entry<String,String> stringStringEntry : oldMatches.entrySet()) {
            line = line.replace(stringStringEntry.getKey(), stringStringEntry.getValue());
        }
        return line;
    }
}
