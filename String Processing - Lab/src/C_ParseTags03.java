import java.util.Scanner;

public class C_ParseTags03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int start = input.indexOf("<upcase>");
        while (start != -1) {
            int end = input.indexOf("</upcase>");

            String value = input.substring(start + 8, end);
            input = input.replaceFirst(value,value.toUpperCase());
            input = input.replaceFirst("<upcase>","");
            input = input.replaceFirst("</upcase>","");

            start = input.indexOf("<upcase>");
        }

        System.out.println(input);
    }
}
