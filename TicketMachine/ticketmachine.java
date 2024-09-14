public class TicketMachine {
    // Harga tiket
    private int price;
    // Jumlah uang yang dimasukkan oleh pengguna
    private int balance;
    // Total uang yang telah diterima oleh mesin
    private int total;

    // Konstruktor untuk menetapkan harga tiket
    public TicketMachine(int ticketPrice) {
        price = ticketPrice;
        balance = 0;
        total = 0;
    }

    // Mengembalikan harga tiket
    public int getPrice() {
        return price;
    }

    // Mengembalikan saldo yang sudah dimasukkan pengguna
    public int getBalance() {
        return balance;
    }

    // Menambahkan uang ke dalam mesin
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Anda telah memasukkan: " + amount + " uang.");
        } else {
            System.out.println("Silakan masukkan jumlah uang yang valid.");
        }
    }

    // Mencetak tiket jika saldo cukup
    public void printTicket() {
        if (balance >= price) {
            System.out.println("### TIKET ###");
            System.out.println("# Harga: " + price + " #");
            System.out.println("#############");

            // Mengurangi saldo pengguna sesuai harga tiket
            balance -= price;
            // Menambah total uang yang diterima mesin
            total += price;

            // Menampilkan sisa saldo setelah pembelian tiket
            System.out.println("Sisa saldo Anda: " + balance);
        } else {
            System.out.println("Saldo tidak cukup. Anda memerlukan " + (price - balance) + " lagi.");
        }
    }

    // Mengembalikan sisa saldo kepada pengguna
    public int refundBalance() {
        int amountToRefund = balance;
        balance = 0;
        System.out.println("Saldo sebesar " + amountToRefund + " telah dikembalikan.");
        return amountToRefund;
    }

    // Mengembalikan total uang yang telah dikumpulkan oleh mesin
    public int getTotal() {
        return total;
    }
}
