import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) throws IOException {
        try(BufferedReader wordsReader = Files.newBufferedReader(Paths.get("file2.txt"));
            BufferedReader textReader = Files.newBufferedReader(Paths.get("file1.txt"));
            PrintWriter out = new PrintWriter(new FileOutputStream("result.txt"))) {

            List<String> words = Arrays.stream(wordsReader.readLine().toLowerCase().split("\\s+"))
                    .collect(Collectors.toList());

            Map<String, Integer> countOfWords = new HashMap<>();

            String line = textReader.readLine();

            while(line != null){
                for(String word : line.toLowerCase().split("[\\s,.!?]+")){
                    if(words.contains(word)){
                        if(!countOfWords.containsKey(word)) {
                            countOfWords.put(word, 0);
                        }
                        int count = countOfWords.get(word) + 1;
                        countOfWords.put(word, count);
                    }
                }
                line = textReader.readLine();
            }

            countOfWords.entrySet().stream()
                    .sorted((es1, es2) -> es2.getValue() - es1.getValue())
                    .forEach(es -> out.printf("%s - %d%n", es.getKey(), es.getValue()));



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
