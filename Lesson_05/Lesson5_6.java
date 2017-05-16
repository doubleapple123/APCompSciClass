import java.util.Scanner;

public class Lesson5_6 {
    static String pass;
    static String user;
    static Scanner kb;

    public static void main(String[] args) {
        kb = new Scanner(System.in);
        pass = "password";
        user = "username";
        passCheck();
    }

    public static void passCheck() {
        System.out.println("Please enter the username and password.");
        String guess1 = kb.next();
        String guess2 = kb.next();
        if ((guess1.equals(user)) && (guess2.equals(pass))) {
            System.out.println("You are granted access!");
        } else {
            if (guess1 != user && guess2.equals(pass)) {
                System.out.println("Your username is incorrect!");
                passCheck();
            } else if (guess2 != pass && guess1.equals(user)) {
                System.out.println("Your password is incorrect!");
                passCheck();
            } else {
                System.out.println("Your password and username is incorrect!");
                passCheck();
            }

        }


    }
}