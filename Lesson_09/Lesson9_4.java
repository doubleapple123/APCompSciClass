import java.util.Scanner;

public class Lesson9_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your starting number.");
        int number = kb.nextInt();
        System.out.println("Please enter your sequance size.");
        int size = kb.nextInt();
        int[] seq = new int[size];
        for (int x = 0; x < seq.length; x++) {
            if (x == 0 || x == 1)
                seq[x] = number;
            else
                seq[x] = seq[x - 1] + seq[x - 2];
            System.out.print(seq[x] + " ");
        }
    }
}