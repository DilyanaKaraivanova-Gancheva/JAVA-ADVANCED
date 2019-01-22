import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> operators = new ArrayDeque<>();
        ArrayDeque<String> expression = new ArrayDeque<>();
        Map<String, Integer> priorites = new HashMap<>();

        priorites.put("*", 3);
        priorites.put("/", 3);
        priorites.put("+", 2);
        priorites.put("-", 2);
        priorites.put("(", 1);

        for (String i:input) {
            try{
                double num = Double.parseDouble(i);
                expression.addLast(i);
            }
            catch (Exception ex){
                switch (i) {
                    case "x":
                        expression.addLast(i);
                        break;
                    case "y":
                        expression.addLast(i);
                        break;
                    case "(":
                        operators.push(i);
                        break;
                    case ")":
                        String symbol = operators.pop();
                        while (!symbol.equals("(")){
                            expression.addLast(symbol);
                            symbol = operators.pop();
                        }
                        break;
                        default:
                            while (!operators.isEmpty() && priorites.get(operators.peek()) >= priorites.get(i)) {
                                expression.addLast(operators.pop());
                            }
                            operators.push(i);
                            break;
                }
            }
        }
        while (!operators.isEmpty()) {
            expression.addLast(operators.pop());
        }

        while (expression.size() > 0) {
            System.out.print(expression.pop()+" ");
        }
    }
}
