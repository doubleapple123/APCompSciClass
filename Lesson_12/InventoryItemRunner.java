import java.util.Scanner;

public class InventoryItemRunner {
    public static void main(String[] args) {
        InventoryItems item1;

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter manufacturer and name.");
        String m = kb.next();
        String n = kb.next();
        System.out.println("Do you want to enter category and price information?");
        String yOrN = kb.next();

        if (yOrN.equals("n")) {
            item1 = new InventoryItems(m, n);
        } else {
            System.out.println("Enter category and price information.");
            System.out.println("Category: ");
            String c = kb.next();
            System.out.println("Price: ");
            int r = kb.nextInt();
            item1 = new InventoryItems(m, n, c, r);
        }
        System.out.println(item1);
    }
}