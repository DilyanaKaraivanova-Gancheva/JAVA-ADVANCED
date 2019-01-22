import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumBytes {
    public static void main(String[] args) {

        String path = "F:\\Projects\\Java Advanced\\08. Files and Streams\\exercise.txt";

        try(BufferedReader bf = Files.newBufferedReader(Paths.get(path))){

            String line = bf.readLine();
            long sum = 0;
            while (line!=null){
                for (Character c : line.toCharArray()) {
                    sum += c;
                }
                line = bf.readLine();
            }
            System.out.println(sum);
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
