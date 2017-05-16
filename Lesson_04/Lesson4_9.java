import java.util.Scanner;

public class Lesson4_9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a length.");
        int l = kb.nextInt();
        System.out.println("Please enter a width.");
        int w = kb.nextInt();
        int perim;

        print(calcPerim(l, w));
    }

    public static int calcPerim(int l, int w) {
        return (2 * l) + (2 * w);
    }

    public static void print(int perim) {
        System.out.println("Your rectangle is " + perim + "ft around.\n ");
    }

}