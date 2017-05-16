import java.util.Random;

public class Car implements Location {
    Random rand = new Random();
    public double[] location;
    public final int ID = rand.nextInt(100000) + 999999;

    public Car() {
        location = new double[2];
    }

    public int getID() {
        return ID;
    }

    public void move(double x_val, double y_val) {
        double x = x_val;
        double y = y_val;
        location[0] = location[0] + x;
        location[1] = location[1] + y;
    }

    public double[] getLoc() {
        return location;
    }
}