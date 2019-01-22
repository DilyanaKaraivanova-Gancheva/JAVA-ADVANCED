import javafx.scene.effect.SepiaTone;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class C_VoinaNumbergame03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstInput = scan.nextLine().split(" ");
        String[] secondInput = scan.nextLine().split(" ");

        Set<Integer> firstPleyar = new LinkedHashSet<>();
        Set<Integer> secondPleyar = new LinkedHashSet<>();

        for (int i = 0; i < 20; i++) {
            firstPleyar.add(Integer.parseInt(firstInput[i]));
            secondPleyar.add(Integer.parseInt(secondInput[i]));
        }
        int rounds = 1;
        while (rounds < 50) {
            if (firstPleyar.isEmpty() || secondPleyar.isEmpty()){
                System.out.println(firstPleyar.isEmpty()?"Second player win!" : "First player win!");
                break;
            }

            int firstNumFisrtPlayer = firstPleyar.iterator().next();
            int firstNumSecondPlayer = secondPleyar.iterator().next();

            firstPleyar.remove(firstNumFisrtPlayer);
            secondPleyar.remove(firstNumSecondPlayer);

            if (firstNumFisrtPlayer > firstNumSecondPlayer) {
                firstPleyar.add(firstNumFisrtPlayer);
                firstPleyar.add(firstNumSecondPlayer);
            } else if(firstNumFisrtPlayer < firstNumSecondPlayer){
                secondPleyar.add(firstNumFisrtPlayer);
                secondPleyar.add(firstNumSecondPlayer);
            }
            rounds++;
        }
        if (firstPleyar.size() < secondPleyar.size()){
            System.out.println("Second player win!");
        }else if(secondPleyar.size() < firstPleyar.size()){
            System.out.println("First player win!");
        }else{
            System.out.println("Draw");
        }
    }
}
