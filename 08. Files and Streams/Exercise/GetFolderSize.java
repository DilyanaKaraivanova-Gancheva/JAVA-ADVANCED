import java.io.File;
import java.util.ArrayDeque;

public class GetFolderSize {
    public static void main(String[] args) {

        File file = new File("F:\\Projects\\Java Advanced\\08. Files and Streams\\Files-and-Streams\\Files-and-Streams");
        ArrayDeque<File> files = new ArrayDeque<>();
        files.offer(file);
        long bytes = 0;

        while (!files.isEmpty()){
            File current = files.poll();
            for (File file1 : current.listFiles()) {
                if(file1.isDirectory()){
                    files.offer(file1);
                } else {
                    bytes += file1.length();
                }
            }
        }
        System.out.println("Folder size: " + bytes);
    }
}
