import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class OfficeStuff {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        TreeMap<String, LinkedHashMap<String, Integer>> companies = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String[] line = bf.readLine().split(" - ");

            String company = line[0].substring(1);
            String product = line[2].substring(0,line[2].length()-1);
            int quantity = Integer.parseInt(line[1]);

            if (!companies.containsKey(company)){
                companies.put(company, new LinkedHashMap<>());
            }
            if (!companies.get(company).containsKey(product)){
                companies.get(company).put(product, quantity);
            }
            else{
                companies.get(company).put(product, companies.get(company).get(product) + quantity);
            }
        }

        for (String stringLinkedHashMapEntry : companies.keySet()) {
            String company = stringLinkedHashMapEntry;
            String output = "";
            output += company + ": ";

            for (String s : companies.get(stringLinkedHashMapEntry).keySet()) {
                String product = s;
                int quantity = companies.get(stringLinkedHashMapEntry).get(s);

                output += product + "-" + quantity + ", ";
            }
            System.out.println(output.substring(0, output.length()-2));
        }
    }
}
