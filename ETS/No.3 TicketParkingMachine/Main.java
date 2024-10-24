import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat mesin tiket dengan harga tiket Rp5000 per jam
        ParkingTicketMachine machine = new ParkingTicketMachine(5000);
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop untuk berinteraksi dengan pengguna
        do {
            System.out.println("\n==== Parking Ticket Machine ====");
            System.out.println("1. Masukkan Uang");
            System.out.println("2. Keluarkan Tiket");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Meminta pengguna memasukkan uang
                    System.out.print("Masukkan jumlah uang (Rp): ");
                    int amount = scanner.nextInt();
                    machine.insertMoney(amount);
                    break;
                case 2:
                    // Mengeluarkan tiket
                    machine.issueTicket();
                    System.out.println("Waktu parkir yang dibeli: " + machine.getTimePurchased() + " jam.");
                    break;
                case 3:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan mesin tiket parkir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 3);  // Loop hingga pengguna memilih untuk keluar

        scanner.close();
    }
}
