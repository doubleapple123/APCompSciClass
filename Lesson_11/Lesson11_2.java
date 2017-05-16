import java.util.Random;
import java.util.Scanner;

public class Lesson11_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner kb = new Scanner(System.in);
        int[][] num = new int[4][4];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = rand.nextInt(99) + 1;

            }


        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
    }


}