import java.util.Scanner;

public class DrivePoints {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter some points.");
        int x1 = kb.nextInt();
        int y1 = kb.nextInt();
        int x2 = kb.nextInt();
        int y2 = kb.nextInt();
        ClassPoints object = new ClassPoints(x1, y1, x2, y2);
        System.out.println("Distance: " + object.getDist());
    }
}