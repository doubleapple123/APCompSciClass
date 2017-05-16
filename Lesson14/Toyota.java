public class Toyota implements Location {
    private double[] location = new double[2];
    private final int id;

    public Toyota(String x_S) {
        id = (int) (Math.random() * 100000) + 999999;
        String[] parsed = new String[2];
        parsed = x_S.split(",");
        location[0] = Double.parseDouble(parsed[0]);
        location[1] = Double.parseDouble(parsed[1]);
    }

    public int getID() {
        return id;
    }

    public void move(double x_val, double y_val) {
        location[0] = location[0] + x_val;
        location[1] = location[1] + y_val;
    }

    public double[] getLoc() {
        return location;
    }
}