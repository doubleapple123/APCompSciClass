import java.util.Scanner;

public class Lesson4_12 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a radius.");
        double radius = kb.nextDouble();
        double area;
        print("The area of a circle with a radius of  " + radius + "is ", circle(radius));
    }

    public static double circle(double radius) {
        return 3.1416 * Math.pow(radius, 2);
    }

    public static void print(String text, double area) {
        System.out.println(text + area);
    }
}