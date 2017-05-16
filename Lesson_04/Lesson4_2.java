import java.util.Scanner;

public class Lesson4_2 {
    public static void main(String[] args) {

        Lesson4_2 form = new Lesson4_2();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first = keyboard.next();
        System.out.println("Enter your last name");
        String last = keyboard.next();
        System.out.println("Enter your title");
        String title = keyboard.next();
        System.out.println("Enter the school site");
        keyboard.nextLine();
        String site = keyboard.nextLine();
        System.out.println("Enter the school year");
        String year = keyboard.nextLine();
        System.out.println("What is your subject?");
        String subject = keyboard.nextLine();
        System.out.println("***********************");
        form.card(first, last, title, site, year, subject);
        System.out.println("\n");
        System.out.println("***********************");

    }

    public void card(String first, String last, String title, String site, String year, String subject) {
        System.out.printf("*%s %16s* \n*%s %30s* \n*%s %22s*", site, year, first, last, title, subject);
    }


}