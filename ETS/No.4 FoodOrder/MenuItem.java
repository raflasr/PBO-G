public class MenuItem {
    private String name;
    private double price;

    // Constructor
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter untuk nama
    public String getName() {
        return name;
    }

    // Getter untuk harga
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - Price: " + price;
    }
}
