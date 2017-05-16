import java.util.Scanner;

public class Lesson7_2 {
    static int number;
    static int average;
    static int digits;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number.");
        number = kb.nextInt();
        average = 0;
        digits = 0;
        avgDigits();
    }

    public static void avgDigits() {
        int num = number;
        while (num > 0) {
            digits += 1;
            average += num % 10;
            num /= 10;
        }
        average /= digits;

        System.out.println("The average of the digits in " + number + " is " + average);
    }
}