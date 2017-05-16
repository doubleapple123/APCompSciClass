import java.util.Scanner;

public class Lesson7_3 {
    static int number;
    static int num;
    static int rev;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a num");
        number = kb.nextInt();
        num = number;
        rev = 0;
        getReverse();
    }

    public static void getReverse() {
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(number + " reversed " + " is " + rev);
    }
}