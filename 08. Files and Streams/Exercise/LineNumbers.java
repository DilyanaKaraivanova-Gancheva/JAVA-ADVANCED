import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineNumbers {
    public static void main(String[] args) {
        String inputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\exercise.txt";
        String outputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\output.txt";

        try(BufferedReader bf = Files.newBufferedReader(Paths.get(inputPath));
            BufferedWriter out = Files.newBufferedWriter(Paths.get(outputPath))){

            String line = bf.readLine();
            int counter = 1;
            while (line!=null){
                String result = counter + ". " + line;
                out.write(result + "\r\n");
                line = bf.readLine();
                counter++;
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
