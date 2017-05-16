import java.util.Scanner;

public class Lesson4_7 {
    static double sa;
    static double side;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Lesson4_7 cube = new Lesson4_7();
        System.out.println("Please enter the side.");
        side = kb.nextDouble();
        calcSurf();
        print();
    }

    public static void calcSurf() {
        sa = Math.pow(side, 2);
    }

    public static void print() {
        System.out.printf("The surface area of a cube with side " + side + " is %1.5f\n", 6 * sa);
    }
}