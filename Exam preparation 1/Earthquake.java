import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Earthquake {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        ArrayDeque<List<Integer>> seismicities = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
           String[] line = bf.readLine().split("\\s+");
           List<Integer> temp = new ArrayList<>();
            for (String s : line) {
                temp.add(Integer.valueOf(s));
            }
            seismicities.offer(temp);

        }

        while (!seismicities.isEmpty()){
           List<Integer> current = seismicities.peek();

           if (current.isEmpty()){
               seismicities.remove();
           }
           int seismicity = current.get(0);
            if (current.size() == 1){
                result.add(seismicity);
                seismicities.remove();
                continue;
            }
            for (int i = 1; i < current.size(); i++) {
                if(seismicity >= current.get(i)){
                    current.remove(i);
                    i--;
                }
                else{
                    result.add(seismicity);
                    current.remove(0);
                    seismicities.add(seismicities.remove());
                    break;
                }

            }

        }
        System.out.println(result.size());
        System.out.println(result.toString().replaceAll("[]\\[,]", ""));
    }
}
