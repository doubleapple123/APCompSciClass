import java.util.Scanner;

public class Lesson4_4 {
    public static void main(String[] args) {
        Lesson4_4 subWoofer = new Lesson4_4();
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter the height.");
        double height = kb.nextDouble();
        System.out.println("Please enter length.");
        double length = kb.nextDouble();
        System.out.println("Please enter the width.");
        double width = kb.nextDouble();


        double formula = subWoofer.calcVol(height, length, width);
        System.out.printf("The volume in cubic feet is " + formula);


    }

    public double calcVol(double h, double l, double w) {
        return ((h * l * w) / (1728));
    }


}