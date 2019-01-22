import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {
        String inputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\input.txt";
        String outputPath = "F:\\Projects\\Java Advanced\\08. Files and Streams\\output.txt";

        try(InputStream in = new FileInputStream(inputPath); OutputStream out = new FileOutputStream(outputPath)) {
            int oneByte = in.read();

            while (oneByte >= 0){
                if (oneByte == 10 || oneByte == 32){
                    out.write(oneByte);
                }
                else{
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        out.write(digits.charAt(i));
                    }
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
