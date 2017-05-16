public class Advance extends Ticket {
    private int daysLeft;

    public Advance() {
        super();
    }

    public Advance(int DL) {
        super();
        daysLeft = DL;
    }

    public int getPrice() {
        if (daysLeft > 10) {
            return 30;
        } else {
            return 40;
        }
    }
}