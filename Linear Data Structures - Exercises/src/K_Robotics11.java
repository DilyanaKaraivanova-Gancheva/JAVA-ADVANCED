import javafx.scene.input.DataFormat;

import java.sql.Time;
import java.util.ArrayDeque;
import java.util.Scanner;

public class K_Robotics11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] robots = scan.nextLine().split(";");
         String startTime = scan.nextLine();

        ArrayDeque deque = new ArrayDeque();
        while (true){
            String product = scan.nextLine();
            if ("END".equals(product)){
                break;
            }
            deque.add(product);
        }

        for (int i = 0; i < robots.length; i++) {
            String[] robot = robots[i].split("-");
            String robotName = robot[0];
            Integer processTime = Integer.parseInt(robot[1]);

            System.out.printf("%s - %s [%s]", robotName,deque.poll(),startTime);

        }
    }
}
