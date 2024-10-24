import java.util.Scanner;

public class ParkingTicketMachine {
    // Atribut
    private int balance;      // Jumlah uang yang dimasukkan pengguna
    private int ticketPrice;  // Harga tiket per jam
    private int ticketTime;   // Waktu parkir yang dibeli (dalam jam)

    // Konstruktor untuk inisialisasi harga tiket
    public ParkingTicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.balance = 0;     // Saldo awal adalah 0
        this.ticketTime = 0;  // Waktu parkir awal adalah 0
    }

    // Metode untuk menambahkan uang
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;  // Menambahkan uang ke saldo
            System.out.println("Saldo saat ini: Rp" + balance);
        } else {
            System.out.println("Masukkan jumlah uang yang valid.");
        }
    }

    // Metode untuk mengeluarkan tiket
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;  // Menghitung waktu parkir yang bisa dibeli
            balance = balance % ticketPrice;     // Sisa saldo yang tidak mencukupi untuk satu jam
            System.out.println("Tiket dikeluarkan untuk " + ticketTime + " jam parkir.");
            System.out.println("Sisa saldo: Rp" + balance);
        } else {
            System.out.println("Saldo tidak cukup untuk membeli tiket.");
        }
    }

    // Metode untuk mengembalikan waktu parkir yang dibeli
    public int getTimePurchased() {
        return ticketTime;
    }
}
