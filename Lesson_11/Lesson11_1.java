import java.util.Random;

public class Lesson11_1 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[][] num = new int[4][4];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = rand.nextInt(100) + 1;
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
    }
}