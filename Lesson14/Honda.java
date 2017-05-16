public class Honda implements Location {
    private final int id;
    double[] l;

    public Honda(double[] location) {
        this.l = location;
        id = (int) (Math.random() * 100000) + 999999;
    }

    public int getID() {
        return id;
    }

    public void move(double x_val, double y_val) {
        l[0] = l[0] + x_val;
        l[1] = l[1] + y_val;
    }

    public double[] getLoc() {
        return l;
    }
}