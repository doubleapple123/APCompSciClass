import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        float Number1 = keyboard.nextFloat();
        System.out.println("Please enter another integer");
        float Number2 = keyboard.nextFloat();
        float Number3 = Number2 * Number1;
        System.out.println(Number1 + " multiplied by " + Number2 + " is " + Number3);


    }


}