import java.util.Scanner;

public class UserRunner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter firstname and lastname.");
        System.out.println("FirstName.");
        String f = kb.next();
        System.out.println("LastName");
        String l = kb.next();

        User user1;

        System.out.println("Would you like to use a public avatar?");
        String y = kb.next();
        if (y.equals("n")) {
            user1 = new User(f, l); //put paramaters... holy moly!!!!
        } else {
            System.out.println("Input an avatar.");
            String avatar = kb.next();
            user1 = new User(f, l, avatar);
        }

        System.out.println(user1);


    }
}