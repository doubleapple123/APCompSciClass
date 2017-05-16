public class GMC implements Location {
    private final int id;
    private double x;
    private double y;

    public GMC(double x_val, double y_val) {
        this.x = x_val;
        this.y = y_val;
        id = (int) (Math.random() * 100000) + 999999;
    }

    public int getID() {
        return id;
    }

    public void move(double x_val, double y_val) {
        x = x + x_val;
        y = y + y_val;
    }

    public double[] getLoc() {
        double[] l = new double[]{x, y};
        return l;
    }
}