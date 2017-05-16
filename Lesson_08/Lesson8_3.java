import java.util.Scanner;

public class Lesson8_3 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = kb.nextInt();
        System.out.println(luck(num));
    }

    public static int luck(int num) {
        if (num > 0) {
            if (num % 10 == 7) {
                return luck(num / 10) + 1;
            }

            return luck(num / 10);
        }
        return 0;
    }

}
