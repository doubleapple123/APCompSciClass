import java.util.Random;

public class GameSystem {
    private String platForm;
    private int serialNo;
    Random rand = new Random();

    public GameSystem() {
        platForm = "";
        serialNo = rand.nextInt(1000000) + 999999;
    }

    public GameSystem(String p) {
        platForm = p;
    }

    public String getPlatform() {
        return platForm;
    }

    public int getSerialNo() {
        return serialNo;
    }
}