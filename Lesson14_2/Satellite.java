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


        for (Car l : locate) {
            double one = 1 + (100 - 1) * rand.nextDouble();
            double two = 1 + (100 - 1) * rand.nextDouble();
            double[] moves = {one, two};

            printout += "\nAfter " + l.getID() + " Moved " + getLocation(moves);
            l.move(one, two);
            printout += "New Location: " + getLocation(l.getLoc());

        }


        printout += "\n\n" + "==========================" +
                "\nDistance from home...";

        for (Location l : locate) {
            printout += "\nDistance for " + l.getID() + ": " + getDistance(l.getLoc(), home);
        }


        System.out.println(printout);
    }

    public static String getDistance(double[] car, double[] home) {
        return String.format("%.2f", Math.sqrt((Math.pow(car[0] - home[0], 2) + Math.pow(car[1] - home[1], 2))));
    }


    public static String getLocation(double[] loc) {
        return String.format("(%.2f, %.2f)", loc[0], loc[1]);
    }
}