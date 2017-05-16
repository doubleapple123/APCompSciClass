import java.util.Scanner;

public class Lesson8_2 {
    public static void main(String[] args) {
        System.out.println("Please enter 3 words.");
        Scanner kb = new Scanner(System.in);
        String word1 = kb.next();
        String word2 = kb.next();
        String word3 = kb.next();
        System.out.println(makeCenter(word1));
        System.out.println(makeCenter(word2));
        System.out.println(makeCenter(word3));
    }

    public static String makeCenter(String word) {
        if (word.length() >= 20) {
            return word;
        }
        return makeCenter(" " + word + " ");
    }
}