import java.util.Scanner;

public class Lesson6_4 {
    static int table;
    static int integer;
    static int i;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a table size.");
        table = kb.nextInt();
        System.out.println("Enter an integer");
        integer = kb.nextInt();
        for (int i = 0; i <= table; i++) {
            System.out.println(i + "\t" + i * integer);
        }
    }
}