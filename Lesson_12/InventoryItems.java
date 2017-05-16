public class InventoryItems {
    private String itemManu, itemName, itemCat;
    private int price;
    private final int UPC = (int) (Math.random() * 900000000) + 100000000;

    public InventoryItems() {
        itemManu = "";
        itemName = "";
        itemCat = "";
        price = 0;
    }

    public InventoryItems(String iM, String iN) {
        itemManu = iM;
        itemName = iN;
        itemCat = "Undefined";
        price = 0;
    }

    public InventoryItems(String iM, String iN, String iC, int pr) {
        itemManu = iM;
        itemName = iN;
        itemCat = iC;
        price = pr;
    }

    public String toString() {
        return "Your inventory: " + "\n" + "Manufacture: " + itemManu + "\n" + "Name: " + itemName + "\n" + "Category: " + itemCat + "\n" + "Price: " + price + "\n" + "UPC: " + UPC;
    }

}
