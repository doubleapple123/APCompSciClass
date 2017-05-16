import java.util.Scanner;

public class HumanRunner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your human properties.");
        System.out.println("Hair: ");
        String hair = kb.next();
        System.out.println("Eyes: ");
        String eyes = kb.next();
        System.out.println("Skin: ");
        String skin = kb.next();
        HumanClass object = new HumanClass(hair, eyes, skin);
        System.out.println("Human 1: " + " Hair: " + object.getHair() + " Eyes: " + object.getEyes() + " Skin" + object.getSkin());
        System.out.println("Enter the same thing for another person.");
        String hair1 = kb.next();
        String eyes1 = kb.next();
        String skin1 = kb.next();
        object.setHES(hair1, eyes1, skin1);
        System.out.println("Human 2: " + " Hair: " + object.getHair() + " Eyes: " + object.getEyes() + " Skin" + object.getSkin());
    }
}