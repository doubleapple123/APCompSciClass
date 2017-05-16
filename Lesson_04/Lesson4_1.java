import java.util.Scanner;

public class Lesson4_1 {
    public static void main(String[] args) {

        Lesson4_1 form = new Lesson4_1();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter item 1");
        String word1 = keyboard.nextLine();
        System.out.println("Please enter the price");
        double price1 = keyboard.nextDouble();

        keyboard.nextLine();
        System.out.println("Please enter item 2");
        String word2 = keyboard.nextLine();
        System.out.println("Please enter the price");
        double price2 = keyboard.nextDouble();

        keyboard.nextLine();
        System.out.println("Please enter item 3");
        String word3 = keyboard.nextLine();
        System.out.println("Please enter the price");
        double price3 = keyboard.nextDouble();


        System.out.println("<<<<____receipt____>>>>");
        form.format(word1, price1);
        form.format(word2, price2);
        form.format(word3, price3);

        double subT = price1 + price2 + price3;
        double tax = subT * 0.08;
        double total = subT + tax;
        form.format("Subtotal", subT);
        form.format("Tax", tax);
        form.format("Total", total);

        System.out.println("\n____________________________");

        System.out.println("*Thank you for your support*");


    }

    public void format(String word, double price) {
        System.out.printf("\n * %10s: %10.2f", word, price);
    }
}