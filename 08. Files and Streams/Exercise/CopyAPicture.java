import java.io.*;

public class CopyAPicture {
    public static void main(String[] args) {

        try(InputStream is = new FileInputStream(new File("picture.jpg"));
            OutputStream os = new FileOutputStream(new File("new.jpg"))){
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
