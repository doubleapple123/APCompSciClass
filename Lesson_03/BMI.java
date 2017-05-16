package Lesson_03;

import java.util.Scanner;

public class BMI


{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds.");
        float weight = keyboard.nextFloat();
        System.out.println("Please enter your height in inches.");
        float height = keyboard.nextFloat();
        float bmi = (weight * 703) / (height * height);
        System.out.println("Your bmi is " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight!");
        } else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("You are normal");
        } else if (bmi > 25 && bmi < 29.9) {
            System.out.println("You are overweight!");
        } else if (bmi >= 30) {
            System.out.println("You are obese!");
        }

    }
}

