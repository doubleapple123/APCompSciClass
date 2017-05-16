import java.util.Scanner;

public class Lesson4_5 {
    static double length;
    static double width;
    static double perimeter;


    public static void main(String[] args) {
        Lesson4_5 rectangle = new Lesson4_5();
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a length.");
        length = kb.nextDouble();
        System.out.println("Please enter a width.");
        width = kb.nextDouble();

        calcPerim();
        print();

    }

    public static void calcPerim() {
        perimeter = (2 * length) + (2 * width);
    }

    public static void print() {
        System.out.printf("Your rectangle is %1.5f ft around.\n ", perimeter);
    }

}