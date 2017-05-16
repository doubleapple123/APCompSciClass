import java.util.Scanner;

public class Lesson4_6 {
    static int num1;
    static int num2;
    static int num3;
    static double avg;

    public static void main(String[] args) {
        Lesson4_6 average = new Lesson4_6();
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        num1 = kb.nextInt();
        System.out.println("Please enter a 2nd integer.");
        num2 = kb.nextInt();
        System.out.println("Please enter a 3rd integer.");
        num3 = kb.nextInt();

        calcAverage();
        print();
    }

    public static void calcAverage() {
        avg = (num1 + num2 + num3) / 3;
    }

    public static void print() {
        System.out.printf("The average of " + num1 + " " + num2 + " " + num3 + " are %1.5f\n ", avg);
    }
}