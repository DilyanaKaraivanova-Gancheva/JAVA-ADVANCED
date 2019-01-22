import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
    public static void main(String[] args) {
        String path = "F:\\Projects\\Java Advanced\\08. Files and Streams\\input.txt";

        try(InputStream in = new FileInputStream(path)){
            int oneByte = in.read();
            while (oneByte >= 0){
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte = in.read();
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
