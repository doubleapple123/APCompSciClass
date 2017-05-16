import java.util.Scanner;

public class Lesson4_10 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int a = kb.nextInt();
        System.out.println("Please enter a second integer.");
        int b = kb.nextInt();
        System.out.println("Please enter a third integer.");
        int c = kb.nextInt();
        double avg;

        print("The average of " + a + " " + b + " " + c + " " + "is ", average(a, b, c));
    }

    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void print(String text, double avg) {
        System.out.println(text + avg);
    }
}