import java.util.Random;

public abstract class Ticket {
    Random rand = new Random();
    private int serialNo;

    public Ticket() {
        serialNo = rand.nextInt(9999999) + 1000000;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public abstract int getPrice();

    public String toString() {
        return "Serial #: " + serialNo + "\nPrice: " + getPrice();
    }
}