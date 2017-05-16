import java.util.Scanner;

public class Lesson5_2 {
    static String name1;
    static double price1;
    static String name2;
    static double price2;
    static String name3;
    static double price3;
    static String name4;
    static double price4;
    static double sub;
    static double discount;
    static double tax;
    static double total;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the first item and price in U.S dollars.");
        name1 = kb.next();
        price1 = kb.nextDouble();
        System.out.println("Please enter the second item and price in U.S dollars.");
        name2 = kb.next();
        price2 = kb.nextDouble();
        System.out.println("Please enter the third item and price in U.S dollars.");
        name3 = kb.next();
        price3 = kb.nextDouble();
        System.out.println("Please enter the fourth item and price in U.S dollars.");
        name4 = kb.next();
        price4 = kb.nextDouble();
        sub = price1 + price2 + price3 + price4;
        tax = 0.08;
        total = sub + (sub - discount) * tax;
        discount();
        System.out.println(total);
        format();
    }

    public static void discount() {
        if (sub >= 2000) {
            discount = sub * 0.15;
        } else {
            discount = sub * 0;
        }
    }

    public static void format() {
        System.out.println("<<<<<<<<<<RECEIPT>>>>>>>>>>");
        System.out.println(name1 + ":" + price1);
        System.out.println(name2 + ":" + price2);
        System.out.println(name3 + ":" + price3);
        System.out.println(name4 + ":" + price4);
        System.out.println(" ");
        System.out.println("Subtotal: " + sub);
        System.out.println("discount: " + discount);
        System.out.println("______________________________");
        System.out.println("THANK YOU FOR SHOPPING WITH US");
    }

}