import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MergeTwoFiles {
    public static void main(String[] args) {
        try(BufferedReader f1Reader = Files.newBufferedReader(Paths.get("file1.txt"));
            BufferedReader f2Reader = Files.newBufferedReader(Paths.get("file2.txt"));
            PrintWriter out = new PrintWriter(new FileOutputStream("output.txt"))) {

            String f1Line = f1Reader.readLine();

            while(f1Line != null){
                out.println(f1Line);
                f1Line = f1Reader.readLine();
            }

            String f2Line = f2Reader.readLine();

            while(f2Line != null){
                out.println(f2Line);
                f2Line = f2Reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
