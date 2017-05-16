import java.util.Scanner;

public class Lesson4_8 {
    static int r;
    static double area;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Lesson4_8 circle = new Lesson4_8();
        System.out.println("Please enter the radius.");
        r = kb.nextInt();
        calcCircle();
        print();
    }

    public static void calcCircle() {
        area = ((4 * 3.14) * r * r);
    }

    public static void print() {
        System.out.printf("The surface area of a radius of " + r + " is %1.5f\n", area);
    }
}