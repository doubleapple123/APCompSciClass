import java.util.Scanner;

public class Lesson4_3 {
    public static void main(String[] args) {
        Lesson4_3 compoundInt = new Lesson4_3();

        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your interest rate.");
        double r = kb.nextDouble();
        System.out.println("Please enter the amount you wanted to borrow.");
        double p = kb.nextDouble();
        System.out.println("Please enter the number of times the loan is compounded per year.");
        double n = kb.nextDouble();
        System.out.println("Please enter the life of the loan in years.");
        double t = kb.nextDouble();

        double formula = compoundInt.interest(r, p, n, t);

        System.out.printf("The total payment per month will be $%.2f", formula);


    }

    public double interest(double r, double p, double n, double t) {
        return p * (Math.pow(1 + r / n, n * t) / (t * 12));
    }


}