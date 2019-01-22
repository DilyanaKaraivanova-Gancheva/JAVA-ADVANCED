import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class G_FixEmails07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String,String> fixEmails = new LinkedHashMap<>();

        while (true){
            String name = scan.nextLine();
            if ("stop".equals(name)){
                break;
            }
            String email = scan.nextLine();

            if ((email.endsWith("us")) || (email.endsWith("uk")) || (email.endsWith("com"))){
                continue;
            }else{
                fixEmails.put(name,email);
            }
        }
        for (String s : fixEmails.keySet()) {
            System.out.printf("%s -> %s%n",s, fixEmails.get(s) );
        }
    }
}
