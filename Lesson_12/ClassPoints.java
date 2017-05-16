public class ClassPoints {
    private int xOne, yOne, yTwo, xTwo;
    private double distance;

    public ClassPoints() {
        xOne = 0;
        yOne = 0;
        xTwo = 0;
        yTwo = 0;
        distance = 0;
    }

    public ClassPoints(int xO, int xT, int yO, int yT) {
        xOne = xO;
        xTwo = xT;
        yOne = yO;
        yTwo = yT;
        distance = 0;
    }

    public void setValues(int xO, int xT, int yO, int yT) {
        xOne = xO;
        xTwo = xT;
        yOne = yO;
        yTwo = yT;
    }

    public double getDist() {
        distance = Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));
        return distance;
    }
}
