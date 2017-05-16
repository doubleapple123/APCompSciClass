public abstract class Console extends GameSystem {

    public abstract String getController();

    public String toString() {
        return "Platform: " + getPlatform() + "\n" + "Serial #: " + getSerialNo() + "\n" + "Controller: " + getController();
    }

}