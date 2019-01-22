import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class TruckTour {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        ArrayDeque<int[]> allPumps = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            allPumps.addLast(Arrays.stream(bf.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray());
        }

        int cnt = 0;

        while (true){
            long fuel = 0;
            boolean found = true;

            for (int[] pumps:allPumps) {
                long petrol = pumps[0];
                long distance = pumps[1];

                fuel+= petrol;

                if (distance > fuel){
                    found = false;
                    break;
                }
                fuel-=distance;
            }
            if (found){
                System.out.println(cnt);
                break;
            }

            allPumps.addLast(allPumps.pop());
            cnt++;
        }
    }
}
