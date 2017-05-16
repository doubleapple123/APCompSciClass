import java.util.Scanner;

public class Lesson4_11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a side.");
        double side = kb.nextDouble();
        double SA;
        print("The SA of a cube with a side of " + side + " is ", cube(side));
    }

    public static double cube(double side) {
        return 6 * Math.pow(side, 2);
    }

    public static void print(String text, double SA) {
        System.out.println(text + SA);
    }
}