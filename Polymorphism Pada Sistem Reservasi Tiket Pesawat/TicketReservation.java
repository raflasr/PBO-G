import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ticket> tickets = new ArrayList<>();
        Passenger passenger;

        System.out.println("Selamat Datang di Sistem Reservasi Tiket Pesawat!");

        // Input biodata pemesan
        System.out.println("\nSilakan masukkan biodata Anda:");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Nomor Telepon: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        passenger = new Passenger(name, phone, email);

        // Proses pemesanan tiket
        while (true) {
            System.out.println("\nPilih kelas penerbangan:");
            System.out.println("1. Ekonomi");
            System.out.println("2. Bisnis");
            System.out.println("3. First Class");
            System.out.println("4. Selesai dan Lihat Ringkasan");
            System.out.print("Masukkan pilihan Anda (1/2/3/4): ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                break;
            }

            System.out.print("Masukkan tarif dasar: ");
            double baseFare = scanner.nextDouble();

            Ticket ticket;
            switch (choice) {
                case 1:
                    ticket = new EconomyTicket(baseFare);
                    break;
                case 2:
                    ticket = new BusinessTicket(baseFare);
                    break;
                case 3:
                    ticket = new FirstClassTicket(baseFare);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }

            tickets.add(ticket);
            System.out.println("\nTiket berhasil ditambahkan!");
            System.out.println(ticket.getDetails());
            System.out.printf("Tarif Total: Rp%.2f\n", ticket.calculateFare());
        }

        // Ringkasan pesanan
        System.out.println("\n=== Ringkasan Pesanan ===");
        System.out.println("\nBiodata Pemesan:");
        System.out.println(passenger);

        double totalCost = 0;
        int count = 1;

        for (Ticket ticket : tickets) {
            System.out.println("\nTiket #" + count++);
            System.out.println(ticket.getDetails());
            System.out.printf("Tarif Total: Rp%.2f\n", ticket.calculateFare());
            totalCost += ticket.calculateFare();
        }

        System.out.printf("\nTotal Semua Tiket: Rp%.2f\n", totalCost);
        System.out.println("Terima kasih telah menggunakan sistem kami!");
        scanner.close();
    }
}
