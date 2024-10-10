import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory apotekInventory = new Inventory(); // Membuat instance Inventory
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu Apotek ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Hapus Item");
            System.out.println("3. Tampilkan Item");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Menghapus newline setelah input angka

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama item: ");
                    String namaItem = scanner.nextLine();
                    System.out.print("Masukkan jumlah: ");
                    int jumlah = scanner.nextInt();
                    apotekInventory.tambahItem(namaItem, jumlah);
                    break;
                case 2:
                    System.out.print("Masukkan nama item yang ingin dihapus: ");
                    String hapusItem = scanner.nextLine();
                    apotekInventory.hapusItem(hapusItem);
                    break;
                case 3:
                    apotekInventory.tampilkanItem();
                    break;
                case 4:
                    running = false;
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
