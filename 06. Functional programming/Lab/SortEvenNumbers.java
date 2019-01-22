import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(scanner.nextLine(), ", ");
        while(st.hasMoreTokens())  // iterate until no more tokens
        {
            list.add(Integer.parseInt(st.nextToken()));

        }
        list.removeIf(n -> n%2 == 1);
        printList(list);

        list.sort((a,b) -> a.compareTo(b));

        printList(list);
    }

    private static void printList(List<Integer> list) {
        if (list.size() == 0){
            return;
        }
        for (int i=0; i< list.size()-1;i++) {
            System.out.printf(list.get(i) + ", ");
        }
        System.out.println(list.get(list.size()-1));
    }
}
