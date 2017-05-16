import java.util.Scanner;

public class Lesson7_1 {
    static int sum = 0;
    static int num;
    static int number;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number.");
        number = kb.nextInt();
        num = number;
        sumDigits();
        System.out.println("The sum of the digits is" + num + sum);
    }

    public static void sumDigits() {
        while (number > 0) {
            number /= 10;
            sum += (num % 10);
            num = num / 10;
        }
    }
}