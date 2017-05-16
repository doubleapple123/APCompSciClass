import java.util.Scanner;

public class Lesson9_7 {
    static String[] words;

    public static void main(String[] args) {
        words = new String[5];
        fillArray();
        System.out.println("For the words ");
        printArray();
        System.out.println("Only " + hasZs() + " has the letter z");
    }

    public static void fillArray() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter 5 words.");
        for (int x = 0; x < 5; x++) {
            words[x] = kb.next();
        }
    }

    public static void printArray() {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String hasZs() {
        String zs = "";
        for (String word : words) {
            if (word.indexOf("z") >= 0) {
                zs = zs + " " + word;
            }
        }
        return zs;
    }
}