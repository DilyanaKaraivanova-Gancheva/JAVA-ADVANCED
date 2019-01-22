import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {
        String inputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\input.txt";
        String outputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\output.txt";

        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
            PrintWriter out = new PrintWriter(new FileWriter(outputPath))) {

            int cnt = 1;
            String line = in.readLine();
            while(line != null){
                if (cnt % 3 == 0){
                    out.println(line);
                }
                line = in.readLine();
                cnt++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
