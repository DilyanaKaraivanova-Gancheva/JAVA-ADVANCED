import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class C_Genome03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String encrypted = reader.readLine();
        Map<String,Integer> decrypted = new LinkedHashMap<>();

        while (!"Stop!".equals(encrypted)){

            Pattern pattern = Pattern.compile("(?<name>[a-zA-Z!@#$?]+)(=(?<len>[0-9]+))(?<size>--([0-9]+))(<<(?<cre>[a-z]+))");
            Matcher matcher = pattern.matcher(encrypted);

            if (matcher.find()){
                Pattern secondpatt = Pattern.compile("(?<a>[a-z])");
                Matcher secondMatch = secondpatt.matcher(matcher.group(1));
                int counter = 0;
                while (secondMatch.find()) {
                    counter++;
                }
                int len = Integer.parseInt(matcher.group(3));

                if (counter == len) {
                    String creature = matcher.group("cre");
                    String count = matcher.group(5);
                    if (!decrypted.containsKey(creature)) {
                        decrypted.put(creature, Integer.parseInt(count));
                    } else {
                        decrypted.put(creature, decrypted.get(creature) + Integer.parseInt(count));
                    }
                }
            }
            encrypted = reader.readLine();
        }

        for (String s : decrypted.keySet()) {
            System.out.printf("%s has genome size of %d%n",s,decrypted.get(s));
        }
    }
}
