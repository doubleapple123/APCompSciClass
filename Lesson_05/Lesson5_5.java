import java.util.Scanner;

public class Lesson5_5 {
    static String x;
    static Scanner kb;

    public static void main(String[] args) {
        kb = new Scanner(System.in);
        choices();
    }

    public static void choices() {
        System.out.println("You wake up in an empty mansion with no recollection of your previous memories. You are very hungry. You see stairs going up and down. Which do you choose?");

        String choice = kb.next();
        if (choice.equals("upstairs")) {
            System.out.println("You have arrived at the 'kitchen'. Do you wish to eat the things in the fridge?");
            choice = kb.next();
            if (choice.equals("yes")) {
                System.out.println("Oh no......the food is poisened and you die.......");
            } else {
                System.out.println("You starve to death and the adventure ends....");
            }
        } else {
            System.out.println("You have arrived in a room named the 'cellar' and a long hallway awaits you. Do you want to continue?");
            choice = kb.next();
            if (choice.equals("yes")) {
                System.out.println("You walk towards the darkness and see a giant statue with your flashlight. Do you want to touch it or ignore it and keep going?");
                choice = kb.next();
                if (choice.equals("touch it")) {
                    System.out.println("The giant statue wakes up and starts to chase you! You are at a crossroads. Do you want to go right or go straight?");
                    choice = kb.next();
                    if (choice.equals("right")) {
                        System.out.println("You meet a dead end the monster gets you!");
                    } else {
                        System.out.println("You keep running but you are just not able to out run the monster. It gets you eventually.");
                    }
                } else {
                    System.out.println("You keep walking forward and you realize that there is no end to this. You eventually die of dehydration.");
                }
            } else {
                System.out.println("You find that the door behind you is locked and you have no choice but to continue. You discover ");

            }
        }
    }
}