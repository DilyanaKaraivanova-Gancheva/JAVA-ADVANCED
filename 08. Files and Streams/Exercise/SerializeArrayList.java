import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SerializeArrayList {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        Collections.addAll(list, 2.2, 3.3, 3.6, 0.77);
        String path = "F:\\list.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
