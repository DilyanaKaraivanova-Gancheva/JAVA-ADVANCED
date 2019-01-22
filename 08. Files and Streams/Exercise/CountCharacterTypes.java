import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) {
        String inputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\exercise.txt";
        String outputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\output.txt";

        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels, 'a','o','e','i','u');

        List<Character> punctuationMarks = new ArrayList<>();
        Collections.addAll(punctuationMarks, '.',',','?','!');
        try(BufferedReader bf = Files.newBufferedReader(Paths.get(inputPath));
            BufferedWriter out = Files.newBufferedWriter(Paths.get(outputPath))){

            int vowelsCount = 0;
            int punctuationsCount = 0;
            int consonantsCount = 0;

            String line = bf.readLine();
            while (line!=null){
                for (Character c : line.toCharArray()) {
                    if (vowels.contains(c)){
                        vowelsCount++;
                    }
                    else if (punctuationMarks.contains(c)){
                        punctuationsCount++;
                    }
                    else{
                        if (c != 32) {
                            consonantsCount++;
                        }
                    }
                }
                line = bf.readLine();
            }
            out.write("Vowels: " + vowelsCount+"\r\n");
            out.write("Consonants: " + consonantsCount+"\r\n");
            out.write("Punctuation: " + punctuationsCount);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
