import java.util.Scanner;

public class Lesson8_4 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a word.");
        String word = kb.next();
        int stop = word.length();
        int start = 1;
        tree(word, stop, start);
    }

    public static void tree(String word, int stop, int start) {
        if (start < stop) {
            start++;
            String fmt = "%" + (stop + 1) + "s\n";
            System.out.printf(fmt, word.substring(0, start));
            tree(word, stop, start);
        }

    }
}
