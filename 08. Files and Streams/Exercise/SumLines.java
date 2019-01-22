import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumLines {
    public static void main(String[] args) {

        String path = "F:\\Projects\\Java Advanced\\08. Files and Streams\\exercise.txt";

        try(BufferedReader bf = Files.newBufferedReader(Paths.get(path))){

            String line = bf.readLine();
            while (line!=null){
                long sum = 0;
                for (Character c : line.toCharArray()) {
                    sum += c;
                }
                System.out.println(sum);
                line = bf.readLine();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
