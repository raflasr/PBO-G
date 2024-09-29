import java.util.ArrayList;
import java.util.Scanner;

// Kelas Bidder merepresentasikan peserta lelang
class Bidder {
    private String name;

    // Konstruktor Bidder
    public Bidder(String name) {
        this.name = name;
    }

    // Mengembalikan nama peserta
    public String getName() {
        return name;
    }
}

// Kelas Auction untuk mengelola proses lelang
public class Auction {
    private ArrayList<Bidder> bidders; // Daftar peserta lelang
    private String item; // Nama barang yang dilelang
    private double highestBid; // Tawaran tertinggi
    private Bidder highestBidder; // Peserta dengan tawaran tertinggi

    // Konstruktor Auction
    public Auction(String item) {
        this.item = item;
        this.bidders = new ArrayList<>();
        this.highestBid = 0.0;
        this.highestBidder = null;
    }

    // Menambahkan peserta lelang
    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
        System.out.println("Peserta " + bidder.getName() + " berhasil ditambahkan.");
    }

    // Menghapus peserta lelang berdasarkan nama
    public void removeBidder(String name) {
        Bidder toRemove = null;
        for (Bidder b : bidders) {
            if (b.getName().equalsIgnoreCase(name)) {
                toRemove = b;
                break;
            }
        }
        if (toRemove != null) {
            bidders.remove(toRemove);
            System.out.println("Peserta " + name + " berhasil dihapus.");
        } else {
            System.out.println("Peserta dengan nama " + name + " tidak ditemukan.");
        }
    }

    // Menampilkan daftar peserta lelang
    public void listBidders() {
        if (bidders.isEmpty()) {
            System.out.println("Tidak ada peserta lelang yang terdaftar.");
        } else {
            System.out.println("Daftar Peserta Lelang:");
            for (int i = 0; i < bidders.size(); i++) {
                System.out.println((i + 1) + ". " + bidders.get(i).getName());
            }
        }
    }

    // Memproses tawaran dari peserta lelang
    public void placeBid(String bidderName, double bidAmount) {
        Bidder bidder = findBidderByName(bidderName);
        if (bidder != null) {
            if (bidAmount > highestBid) {
                highestBid = bidAmount;
                highestBidder = bidder;
                System.out.println(bidder.getName() + " menawar " + bidAmount + " untuk " + item);
            } else {
                System.out.println(bidder.getName() + " menawar " + bidAmount + " tetapi tidak cukup tinggi.");
            }
        } else {
            System.out.println("Peserta dengan nama " + bidderName + " tidak ditemukan.");
        }
    }

    // Mencari peserta berdasarkan nama
    private Bidder findBidderByName(String name) {
        for (Bidder b : bidders) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }

    // Menampilkan tawaran tertinggi saat ini
    public void showHighestBid() {
        if (highestBidder != null) {
            System.out.println("Tawaran tertinggi saat ini: " + highestBid + " oleh " + highestBidder.getName());
        } else {
            System.out.println("Belum ada tawaran.");
        }
    }

    // Menampilkan hasil lelang
    public void endAuction() {
        if (highestBidder != null) {
            System.out.println("Pemenang lelang: " + highestBidder.getName() + " dengan tawaran " + highestBid);
        } else {
            System.out.println("Tidak ada pemenang lelang untuk " + item);
        }
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang akan dilelang: ");
        String itemName = scanner.nextLine();

        Auction auction = new Auction(itemName);
        int choice;

        do {
            // Menampilkan menu
            System.out.println("\nMenu Lelang:");
            System.out.println("1. Tambah Peserta");
            System.out.println("2. Hapus Peserta");
            System.out.println("3. Lihat Daftar Peserta");
            System.out.println("4. Tempatkan Tawaran");
            System.out.println("5. Lihat Tawaran Tertinggi");
            System.out.println("6. Akhiri Lelang dan Umumkan Pemenang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (choice) {
                case 1:
                    // Menambahkan peserta
                    System.out.print("Masukkan nama peserta: ");
                    String name = scanner.nextLine();
                    auction.addBidder(new Bidder(name));
                    break;
                case 2:
                    // Menghapus peserta
                    System.out.print("Masukkan nama peserta yang ingin dihapus: ");
                    String removeName = scanner.nextLine();
                    auction.removeBidder(removeName);
                    break;
                case 3:
                    // Menampilkan daftar peserta
                    auction.listBidders();
                    break;
                case 4:
                    // Memproses tawaran
                    System.out.print("Masukkan nama peserta yang ingin menawar: ");
                    String bidderName = scanner.nextLine();
                    System.out.print("Masukkan jumlah tawaran: ");
                    double bidAmount = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan buffer
                    auction.placeBid(bidderName, bidAmount);
                    break;
                case 5:
                    // Menampilkan tawaran tertinggi
                    auction.showHighestBid();
                    break;
                case 6:
                    // Mengakhiri lelang
                    auction.endAuction();
                    break;
                case 0:
                    // Keluar dari program
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
