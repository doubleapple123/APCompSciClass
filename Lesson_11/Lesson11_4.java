import java.util.Random;
import java.util.Scanner;

public class Lesson11_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner kb = new Scanner(System.in);
        int[][] num = new int[4][4];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = rand.nextInt(100) + 1;
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Please enter a number");
        int divisor = kb.nextInt();

        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % divisor == 0) {
                    count++;
                }
            }
        }
        System.out.println("There are " + count + " numbers divisible by " + divisor + " in the array.");
    }
}