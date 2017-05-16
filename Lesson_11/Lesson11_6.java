import java.util.Random;
import java.util.Scanner;

public class Lesson11_6 {
    static String[] health;
    static int healthload = 6;
    static int healthCount;

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner kb = new Scanner(System.in);
        String turn = "";
        int damage = 0;
        int ammount = 0;
        healthCount = 6;
        health = new String[healthload];
        while (!turn.equals("Q") && healthCount > 0) {
            System.out.println("Your turn! Hit enter when ready: ");
            turn = kb.nextLine();
            damage = rand.nextInt(2) + 1;
            ammount = rand.nextInt(6) + 1;
            System.out.println(takeDamage(damage, ammount));
            printClip();

        }
        System.out.println("You died!");
    }

    static String takeDamage(int damage, int ammount) {
        if (damage == 1) {
            healthCount = -ammount;
            return "Taking " + ammount + "  damage";
        } else {
            return "Power up " + ammount + "!";
        }
    }

    static void printClip() {
        String output = ("Health: \t");
        for (int i = 0; i < healthCount; i++) {
            if (i < healthCount) {
                health[i] = "@";
            } else {
                health[i] = "[]";
            }
            output += health[i];
        }
        System.out.println(output);
    }

}