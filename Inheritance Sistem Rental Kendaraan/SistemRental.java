import java.util.ArrayList;
import java.util.Scanner;

public class SistemRental {
    private static ArrayList<Kendaraan> kendaraanList = new ArrayList<>();
    private static ArrayList<Penyewa> penyewaList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("=== Sistem Rental ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tambah Penyewa");
            System.out.println("3. Lihat Daftar Kendaraan");
            System.out.println("4. Lihat Daftar Penyewa");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihan) {
                case 1:
                    tambahKendaraan();
                    break;
                case 2:
                    tambahPenyewa();
                    break;
                case 3:
                    lihatDaftarKendaraan();
                    break;
                case 4:
                    lihatDaftarPenyewa();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (pilihan != 5);
    }

    private static void tambahKendaraan() {
        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Sepeda");
        System.out.print("Pilih opsi: ");
        int jenis = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Masukkan merk: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan model: ");
        String model = scanner.nextLine();
        System.out.print("Masukkan tahun produksi: ");
        int tahunProduksi = scanner.nextInt();

        Kendaraan kendaraan = null;
        if (jenis == 1) {
            System.out.print("Masukkan jumlah roda: ");
            int jumlahRoda = scanner.nextInt();
            kendaraan = new Mobil(merk, model, tahunProduksi, jumlahRoda);
        } else if (jenis == 2) {
            System.out.print("Masukkan jumlah roda: ");
            int jumlahRoda = scanner.nextInt();
            kendaraan = new Motor(merk, model, tahunProduksi, jumlahRoda);
        } else if (jenis == 3) {
            scanner.nextLine();  // Consume newline
            System.out.print("Masukkan jenis sepeda (misal: BMX, balap): ");
            String jenisSepeda = scanner.nextLine();
            kendaraan = new Sepeda(merk, model, tahunProduksi, jenisSepeda);
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            return;
        }

        kendaraanList.add(kendaraan);
        System.out.println("Kendaraan berhasil ditambahkan!");
    }

    private static void tambahPenyewa() {
        System.out.print("Masukkan nama penyewa: ");
        String nama = scanner.nextLine();

        if (kendaraanList.isEmpty()) {
            System.out.println("Tidak ada kendaraan tersedia untuk disewa.");
            return;
        }

        System.out.println("Pilih kendaraan untuk disewa:");
        for (int i = 0; i < kendaraanList.size(); i++) {
            System.out.println((i + 1) + ". " + kendaraanList.get(i).info());
        }
        System.out.print("Pilih nomor kendaraan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (pilihan < 1 || pilihan > kendaraanList.size()) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        Kendaraan kendaraanDipilih = kendaraanList.get(pilihan - 1);

        System.out.print("Masukkan durasi sewa (dalam hari): ");
        int durasiSewa = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        penyewaList.add(new Penyewa(nama, kendaraanDipilih, durasiSewa));
        System.out.println("Penyewa berhasil ditambahkan!");
    }

    private static void lihatDaftarKendaraan() {
        if (kendaraanList.isEmpty()) {
            System.out.println("Tidak ada kendaraan yang tersedia.");
        } else {
            System.out.println("Daftar Kendaraan:");
            for (Kendaraan kendaraan : kendaraanList) {
                System.out.println(kendaraan.info());
            }
        }
    }

    private static void lihatDaftarPenyewa() {
        if (penyewaList.isEmpty()) {
            System.out.println("Tidak ada penyewa.");
        } else {
            System.out.println("Daftar Penyewa:");
            for (Penyewa penyewa : penyewaList) {
                System.out.println(penyewa.info());
            }
        }
    }
}
