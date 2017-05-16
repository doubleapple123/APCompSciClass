import java.util.Scanner;

public class Lesson5_4 {
    static double weight;
    static double height;
    static double bmi;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds");
        weight = kb.nextDouble();
        System.out.println("Please enter your height in inches.");
        height = kb.nextDouble();
        bmi = (weight * 703) / (height * height);
        System.out.println("Your bmi is " + bmi);
        System.out.println("You are " + calcBMI(bmi));
    }

    public static String calcBMI(double condition) {
        if (bmi < 18.5) {
            return "Condition is Underweight";
        } else if (bmi > 18.5 && bmi < 24.9) {
            return "Condition is Normal";
        } else if (bmi > 25 && bmi < 29.9) {
            return "Condition is Obese";
        } else if (bmi > 35 && bmi < 39.9) {
            return "Condition is Very Obese";
        } else {
            return "Condition is very Obese";
        }
    }
}