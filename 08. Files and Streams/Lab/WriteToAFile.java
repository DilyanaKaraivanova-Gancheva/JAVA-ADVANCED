import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteToAFile {
    public static void main(String[] args) {
        String inputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\input.txt";
        String outputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\output.txt";

        List<Character> chars = new ArrayList<>();
        Collections.addAll(chars, '.',',', '!', '?');

        try(InputStream in = new FileInputStream(inputPath); OutputStream out = new FileOutputStream(outputPath)){

            int oneByte = in.read();
            while (oneByte >= 0){
                if (!chars.contains((char) oneByte)){
                    out.write(oneByte);
                }
                oneByte = in.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
