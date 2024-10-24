import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Daftar menu yang tersedia
        List<MenuItem> menu = new ArrayList<>();
        menu.add(new MenuItem("Pizza", 50.0));
        menu.add(new MenuItem("Pasta", 30.0));
        menu.add(new MenuItem("Salad", 20.0));
        menu.add(new MenuItem("Burger", 40.0));
        menu.add(new MenuItem("Soda", 10.0));

        Scanner scanner = new Scanner(System.in);
        FoodOrder order = new FoodOrder();

        while (true) {
            // Menampilkan menu
            System.out.println("\n--- Restaurant Menu ---");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i));
            }
            System.out.println("Enter the item number to add to your order (or 0 to finish):");

            // Mengambil input dari pengguna
            int choice = scanner.nextInt();
            if (choice == 0) {
                break; // Keluar dari loop jika pengguna memilih 0
            } else if (choice > 0 && choice <= menu.size()) {
                order.addMenuItem(menu.get(choice - 1)); // Menambahkan item ke pesanan
                System.out.println(menu.get(choice - 1).getName() + " has been added to your order.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // Menampilkan total harga sebelum pembayaran
        order.displayOrder();

        // Meminta pengguna untuk melakukan pembayaran
        System.out.println("Please enter the amount of money paid:");
        double amountPaid = scanner.nextDouble();

        // Mengecek apakah jumlah uang yang dibayarkan cukup
        if (amountPaid >= order.getTotalPrice()) {
            order.setPaid();
            double change = amountPaid - order.getTotalPrice();
            System.out.printf("Thank you for your payment! Your change is: %.2f\n", change);
        } else {
            System.out.printf("Insufficient payment. You still owe: %.2f\n", order.getTotalPrice() - amountPaid);
        }

        // Menampilkan rincian pesanan akhir
        order.displayOrder();
        scanner.close();
    }
}
