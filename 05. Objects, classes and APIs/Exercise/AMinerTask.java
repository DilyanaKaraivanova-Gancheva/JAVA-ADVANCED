import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> mine = new HashMap<>();

        while (true){
          String recource = scanner.nextLine();
          if (recource.equals("stop")){
              break;
          }
          Integer quantity = Integer.parseInt(scanner.nextLine());

          if (!mine.containsKey(recource)){
              mine.put(recource, quantity);
          }
          else{
              mine.put(recource, mine.get(recource) + quantity);
          }
        }

        for (String resource:mine.keySet()) {
            System.out.printf("%s -> %s%n", resource, mine.get(resource));
        }
    }
}

