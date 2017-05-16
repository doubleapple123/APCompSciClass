import java.util.Scanner;

public class Lesson6_5 {
    static int number;
    static int count;
    static int i;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a count.");
        count = kb.nextInt();
        System.out.println("Enter a number.");
        number = kb.nextInt();

        for (int i = count; i <= number; i += count) {
            System.out.println(i);
        }

    }
}