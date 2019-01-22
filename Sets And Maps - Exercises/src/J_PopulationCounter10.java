import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J_PopulationCounter10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input =  scan.nextLine().split("\\|");
        Map<String, LinkedHashMap<String,Long>> report = new LinkedHashMap<>();

        while (true){

            if (input[0].equals("report")){
                break;
            }

            String country = input[1];
            String sity = input[0];
            Long population = Long.parseLong(input[2]);

            if (!report.containsKey(country)){
                LinkedHashMap<String,Long> sityPop = new LinkedHashMap<>();
                sityPop.put(sity,population);
                report.put(country,sityPop);
            }else{
                if (!report.get(country).containsKey(sity)){
                    report.get(country).put(sity,population);
                }
            }
            input =  scan.nextLine().split("\\|");
        }


    }
}
