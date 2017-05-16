import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the properties of your car.");
        String paint = kb.nextLine();
        //System.out.println("got paint : " + paint);
        String interior = kb.nextLine();
        String engine = kb.nextLine();
        String tires = kb.nextLine();
        CarClass object = new CarClass(paint, interior, engine, tires);
        System.out.println("Your vehical is ready........");
        System.out.println("Paint: " + object.getPaint());
        System.out.println("Interior: " + object.getInterior());
        System.out.println("Engine: " + object.getEngine());
        System.out.println("Tires: " + object.getTires());
    }
}