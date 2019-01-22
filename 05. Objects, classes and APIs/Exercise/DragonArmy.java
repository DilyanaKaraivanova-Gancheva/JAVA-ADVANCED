import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DragonArmy {
    public static int DEFAULT_DAMAGE= 45;
    public static int DEFAULT_HEALTH= 250;
    public static int DEFAULT_ARMOR= 10;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String[] line = bf.readLine().split("\\s+");

            String type = line[0];
            String name = line[1];
            int damage = line[2].equals("null")? DEFAULT_DAMAGE:Integer.valueOf(line[2]);
            int health = line[3].equals("null")? DEFAULT_HEALTH:Integer.valueOf(line[3]);
            int armor = line[4].equals("null")? DEFAULT_ARMOR:Integer.valueOf(line[4]);
            if (!dragons.containsKey(type)){
                dragons.put(type, new TreeMap<>());
            }
            dragons.get(type).put(name, new int[]{damage, health, armor});
        }

        for (Map.Entry<String, TreeMap<String, int[]>> entry : dragons.entrySet()) {
            calculateAndPrintAvgStats(entry.getValue(), entry.getKey());

            for (Map.Entry<String, int[]> dragon : entry.getValue().entrySet()) {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", dragon.getKey(), dragon.getValue()[0],
                        dragon.getValue()[1], dragon.getValue()[2]);
            }
        }
    }

    private static void calculateAndPrintAvgStats(TreeMap<String, int[]> value, String type) {
        double avgDamage = 0.0;
        double avgHealth = 0.0;
        double avgArmor = 0.0;

        for (int[] stats : value.values()) {
            avgDamage += stats[0];
            avgHealth += stats[1];
            avgArmor += stats[2];
        }
        int size = value.size();
        avgDamage /= size;
        avgHealth /= size;
        avgArmor /= size;

        System.out.printf("%s::(%.2f/%.2f/%.2f)%n", type, avgDamage, avgHealth, avgArmor);
    }
}
