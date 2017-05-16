import java.util.Random;
import java.util.Scanner;

public class Lesson5_1 {
    static int num;
    static int num1;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();
        num = rand.nextInt(6) + 1;
        num1 = rand.nextInt(6) + 1;
        System.out.println("You rolled a " + num);
        System.out.println("The computer rolled a " + num1);
        RollDice();

    }

    public static void RollDice() {
        if (num > num1) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }

}