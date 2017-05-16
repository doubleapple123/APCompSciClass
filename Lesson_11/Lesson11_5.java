import java.util.Scanner;

public class Lesson11_5 {
    static int bulletCount;
    static int ClipSize = 16;
    static int shotCount;
    static String[] clip;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        bulletCount = 96;
        shotCount = 0;
        clip = new String[ClipSize];
        resetClip();
        String action;

        while (bulletCount > 0 || shotCount > 0) {
            System.out.println("Action: ");
            action = kb.next();
            if (action.equals("R")) {
                reload();
            }
            if (action.equals("S")) {
                System.out.println(shoot());
            }
            System.out.println(printClip());
        }

        System.out.println("Out of bullets!!!");
    }

    static void resetClip() {
        for (int i = 0; i < clip.length; i++) {
            clip[i] = "[]";
        }
    }

    static String shoot() {
        if (shotCount > 0) {
            clip[shotCount - 1] = "[]";
            shotCount--;
            return "Boom!!!";
        } else {
            return "Reload!!!";
        }
    }

    static void reload() {
        if (bulletCount >= ClipSize) {
            bulletCount -= ClipSize;
            shotCount = ClipSize;
        } else {
            shotCount = bulletCount;
            bulletCount = 0;
        }
        resetClip();
        for (int i = 0; i < shotCount; i++) {
            clip[i] = " * ";
        }

    }

    static String printClip() {
        String output = "Bullets: \t" + bulletCount + "\n" + "Clip: \t";
        for (int i = 0; i < ClipSize; i++) {
            output += clip[i];
        }
        return output;

    }
}