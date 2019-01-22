import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> legendaryMaterials = new LinkedHashMap<>();
        TreeMap<String, Integer> junkMaterials = new TreeMap<>();

        legendaryMaterials.put("fragments",0);
        legendaryMaterials.put("motes",0);
        legendaryMaterials.put("shards",0);

        boolean isObtained = false;
        while (!isObtained) {
            String[] line = scanner.nextLine().split("\\s+");

            for (int i = 0; i <line.length-1; i+=2) {
                int quantity = Integer.parseInt(line[i]);
                String material = line[i+1].toLowerCase();


               if (material.equals("motes")|| material.equals("shards")|| material.equals("fragments")){

                       legendaryMaterials.replace(material, legendaryMaterials.get(material) + quantity);

                   if (legendaryMaterials.get(material) >= 250){
                       String itemName = "";
                       if (material.equalsIgnoreCase("motes")){
                          itemName = "Dragonwrath";
                       }
                       else if (material.equalsIgnoreCase("shards")){
                            itemName = "Shadowmourne";
                       }
                       else if (material.equalsIgnoreCase("fragments")){
                           itemName = "Valanyr";
                       }
                       System.out.println(itemName + " obtained!");
                       legendaryMaterials.replace(material, legendaryMaterials.get(material)-250);
                       isObtained = true;
                       break;
                   }
                }
                else{
                   if (!junkMaterials.containsKey(material)){
                       junkMaterials.put(material, quantity);
                   }
                   else{
                       junkMaterials.replace(material, junkMaterials.get(material) + quantity);
                   }
               }
            }
        }
        LinkedHashMap<String, Integer> sortedKeyMaterials = legendaryMaterials.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (String m:sortedKeyMaterials.keySet()) {
            System.out.println(m + ": " + sortedKeyMaterials.get(m));
        }

        for (String m:junkMaterials.keySet()) {
            System.out.println(m + ": " + junkMaterials.get(m));
        }
    }
}
