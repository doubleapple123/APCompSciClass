import java.util.Scanner;

public class Lesson6_2 {
    static int x;
    static int factorial;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number.");
        x = kb.nextInt();
        factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}