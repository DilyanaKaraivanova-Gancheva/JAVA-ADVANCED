import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class D_Ranking04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> contestPass = new HashMap<>();
        Map<String,Map<String,String>> finalList = new HashMap<>();


        String input = reader.readLine();
        while (!"end of contests".equals(input)){
            String[] data = input.split(":");
            String contest = data[0];
            String pass = data[1];

            contestPass.put(contest,pass);

            input = reader.readLine();
        }
        String nextInput = reader.readLine();
        while (!"end of submissions".equals(nextInput)){
            String[] tokens = nextInput.split("=>");

            String checkContest = tokens[0];
            String checkPass = tokens[1];
            String user = tokens[2];
            String points = tokens[3];

            for (String s : contestPass.keySet()) {
                if (s.equals(checkContest) && contestPass.get(s).equals(checkPass)){
                    if (!finalList.containsKey(user)) {
                        finalList.put(user, new HashMap<>());
                        finalList.get(user).put(checkContest, points);
                    }else{
                        if (finalList.get(user).equals(checkContest)) {
                            if (Integer.parseInt(points) > Integer.parseInt(finalList.get(user).get(checkContest))) {
                                finalList.get(user).put(checkContest, points);
                            }
                        }else{
                            finalList.get(user).put(checkContest, points);
                        }
                    }
                }
            }
            nextInput = reader.readLine();
        }
        for (Map.Entry<String, Map<String, String>> stringMapEntry : finalList.entrySet()) {
            System.out.println(stringMapEntry.getKey());

        }
    }
}
