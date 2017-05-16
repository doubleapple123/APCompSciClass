public class PC extends GameSystem {
    public String systemInput() {
        return "Keyboard and Mouse";
    }

    public String toString() {
        return "Platform: " + getPlatform() + "\n" + "Serial #: " + getSerialNo() + "\n" + "System input: " + systemInput();
    }
}