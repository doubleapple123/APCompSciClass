import java.util.Scanner;

public class MPHRunner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter values for distance, hours and minutes.");
        int distance = kb.nextInt();
        int hours = kb.nextInt();
        int minutes = kb.nextInt();
        MilesPerHour object = new MilesPerHour(distance, hours, minutes);
        System.out.print("Distance: " + object.getMPH() + "mph.");
    }
}