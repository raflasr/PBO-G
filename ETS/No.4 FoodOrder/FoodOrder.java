import java.util.ArrayList;

public class FoodOrder {
    private ArrayList<MenuItem> menuItems;
    private double totalPrice;
    private boolean isPaid;

    // Constructor
    public FoodOrder() {
        menuItems = new ArrayList<>();
        totalPrice = 0.0;
        isPaid = false;
    }

    // Menambahkan item menu
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
        calculateTotal();
    }

    // Menghitung total harga
    private void calculateTotal() {
        totalPrice = 0.0;
        for (MenuItem item : menuItems) {
            totalPrice += item.getPrice();
        }
    }

    // Mengatur status pembayaran
    public void setPaid() {
        isPaid = true;
    }

    // Mengambil total harga
    public double getTotalPrice() {
        return totalPrice;
    }

    // Mengambil status pembayaran
    public boolean isPaid() {
        return isPaid;
    }

    // Menampilkan daftar pesanan
    public void displayOrder() {
        System.out.println("Your Order:");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
        System.out.printf("Total Price: %.2f\n", totalPrice);
        System.out.println("Is Paid: " + (isPaid ? "Yes" : "No"));
    }
}
