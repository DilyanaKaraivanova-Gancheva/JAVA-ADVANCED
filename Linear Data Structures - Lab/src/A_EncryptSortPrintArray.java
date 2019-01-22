
import java.util.Arrays;
import java.util.Scanner;

public class A_EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int[] encryptedWord = new int[num];
        for (int j = 0; j < num ; j++) {
            String name = scan.nextLine();
            int sum = 0;
            for (int i = 0; i < name.length(); i++) {
                char currentChar = name.charAt(i);
                if (isVowel(currentChar)){
                    sum += currentChar * name.length();
                }else{
                    sum += currentChar / name.length();
                }
            }
            encryptedWord[j] = sum;
        }
        Arrays.sort(encryptedWord);
        for (int n : encryptedWord) {
            System.out.println(n);
        }
    }

    private static boolean isVowel(char letter) {
        char[] vowels = new char[]{'a','o','e','i','u','A','E','I','O','U'};
        for (char vowel : vowels) {
            if (vowel == (letter)){
                return true;
            }
        }
        return false;
    }
}
