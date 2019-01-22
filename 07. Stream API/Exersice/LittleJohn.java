import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LittleJohn {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String smallArrow = ">----->";
        String medArrow = ">>----->";
        String largeArrow = ">>>----->>";

        StringBuilder input = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            input.append(bf.readLine()).append("\r\n");
        }

        int countLarge = countArrows(input, largeArrow);
        int countMed = countArrows(input, medArrow);
        int countSmall = countArrows(input, smallArrow);

        String number = countSmall + "" + countMed+countLarge;
        StringBuilder result = new StringBuilder();
        result.append(Integer.toBinaryString(Integer.parseInt(number)));

        StringBuilder reversed = new StringBuilder(result);
        reversed.reverse();
        result.append(reversed);

        long resNum = Integer.parseInt(result.toString(),2);
        System.out.println(resNum);
    }

    private static int countArrows(StringBuilder input, String arrow) {
        int index = input.indexOf(arrow);
        int count = 0;
        while (index != -1){
            count++;
            input.delete(index, index + arrow.length()+1);
            index = input.indexOf(arrow);
        }
        return count;
    }
}
