import java.util.Scanner;

public class Lesson6_6 {
    static int x;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = kb.next();
        x = word.length();
        for (int i = 0; i <= word.length(); i++) {
            System.out.println(word.substring(i, x));
        }
    }
}