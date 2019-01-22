import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> lastStrings = new ArrayDeque<>();
        String sb = "";
        lastStrings.push(sb);
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");

            int command = Integer.parseInt(line[0]);
            switch (command){
                case 1:
                    sb+=(line[1]);
                    lastStrings.push(sb);
                    break;
                case 2:
                    int elements = Integer.parseInt(line[1]);
                   sb =  sb.substring(0,sb.length()-elements);
                    lastStrings.push(sb);
                    break;
                case 3:
                    int element = Integer.parseInt(line[1]);
                    System.out.println(sb.charAt(element-1));
                    break;
                case 4:
                    lastStrings.pop();
                    sb = lastStrings.peek();
                    break;
            }
        }
    }
}
