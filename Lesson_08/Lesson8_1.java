import java.util.Scanner;

public class Lesson8_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("User inputs for a sentence.");
        String sentence = kb.nextLine();
        System.out.println(replace(sentence));
    }

    public static String replace(String sentence) {
        if (sentence.indexOf(" ") <= 0) {
            return sentence;
        }
        return replace(sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1));
    }
}	