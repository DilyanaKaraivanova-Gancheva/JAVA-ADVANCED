import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String inputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\input.txt";
        String outputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\output.txt";

        try(Scanner scanner = new Scanner(new FileInputStream(inputPath));
        PrintWriter out = new PrintWriter(new FileOutputStream(outputPath))) {

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    out.println(scanner.nextInt());
                }
                scanner.next();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
