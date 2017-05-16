import java.util.ArrayList;
import java.util.Random;

public class Satellite {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Car> locate = new ArrayList<>();
        double[] honLoc = {5, 6};
        locate.add(new Honda(honLoc));
        locate.add(new Toyota("8, 9"));
        locate.add(new GMC(3, 8));

        double[] home = {0, 0};


        String printout = "\n\n" +
                "==========================" + "\nStarting locations...\n";
        for (Car l : locate) {
            printout += l.getID() + ":" + getLocation(l.getLoc()) + "\n";
        }


        for (Location l : locate) {
            double one = 1 + (100 - 1) * rand.nextDouble();
            double two = 1 + (100 - 1) * rand.nextDouble();


            printout += "\nAfter " + l.getID() + " Moved " + "(" + String.format("%.2f", one) + ")" + "(" + String.format("%.2f", two) + ")" + "\n";
            ((Car) l).move(one, two);
            printout += "New Location: " + "(" + getLocation(l.getLoc()) + ")" + "\n";

        }


        printout += "\n\n" + "==========================" +
                "\nDistance from home...";

        for (Location l : locate) {
            printout += "\nDistance for " + l.getID() + ": ( " + String.format("%.2f", getDistance(l.getLoc(), home)) + ")";
        }


        System.out.println(printout);
    }

    public static double getDistance(double[] car, double[] home) {
        return Math.sqrt((Math.pow(car[0] - home[0], 2) + Math.pow(car[1] - home[1], 2)));
    }


    public static String getLocation(double[] loc) {
        return loc[0] + ", " + loc[1];
    }
}