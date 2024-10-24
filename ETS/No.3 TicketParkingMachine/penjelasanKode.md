### Penjelasan Kelas `ParkingTicketMachine`:
Kelas ini bertanggung jawab untuk melakukan operasi-operasi terkait mesin tiket parkir, seperti menerima uang, menghitung waktu parkir, dan mengeluarkan tiket.

#### Atribut:
- `balance`: Menyimpan saldo uang yang dimasukkan oleh pengguna.
- `ticketPrice`: Menyimpan harga tiket per jam (misalnya, Rp5.000 per jam).
- `ticketTime`: Menyimpan jumlah waktu parkir (dalam jam) yang bisa dibeli berdasarkan uang yang dimasukkan.

#### Konstruktor:
```java
public ParkingTicketMachine(int ticketPrice) {
    this.ticketPrice = ticketPrice;
    this.balance = 0;     
    this.ticketTime = 0;  
}
```
Konstruktor ini menerima satu parameter `ticketPrice`, yang merupakan harga tiket per jam. Ketika objek `ParkingTicketMachine` dibuat, saldo (`balance`) dan waktu parkir (`ticketTime`) diinisialisasi ke 0.

#### Metode `insertMoney(int amount)`:
```java
public void insertMoney(int amount) {
    if (amount > 0) {
        balance += amount;  
        System.out.println("Saldo saat ini: Rp" + balance);
    } else {
        System.out.println("Masukkan jumlah uang yang valid.");
    }
}
```
- Metode ini menerima input `amount` dari pengguna yang merupakan jumlah uang yang ingin dimasukkan ke mesin.
- Jika uang yang dimasukkan lebih besar dari 0, maka uang tersebut ditambahkan ke saldo (`balance`).
- Saldo yang baru akan dicetak di layar.

#### Metode `issueTicket()`:
```java
public void issueTicket() {
    if (balance >= ticketPrice) {
        ticketTime = balance / ticketPrice;  
        balance = balance % ticketPrice;    
        System.out.println("Tiket dikeluarkan untuk " + ticketTime + " jam parkir.");
        System.out.println("Sisa saldo: Rp" + balance);
    } else {
        System.out.println("Saldo tidak cukup untuk membeli tiket.");
    }
}
```
- Metode ini mengecek apakah saldo pengguna cukup untuk membeli setidaknya satu jam parkir.
- Jika cukup, ia akan menghitung berapa jam parkir yang bisa dibeli dengan saldo yang ada (`balance / ticketPrice`).
- Saldo yang tersisa (jika ada) akan dihitung dan disimpan sebagai `balance % ticketPrice`.
- Jika saldo tidak mencukupi, pesan kesalahan akan ditampilkan.

#### Metode `getTimePurchased()`:
```java
public int getTimePurchased() {
    return ticketTime;
}
```
- Metode ini mengembalikan jumlah jam parkir yang telah dibeli oleh pengguna.

---

### Penjelasan Kelas `Main`:
Kelas ini bertanggung jawab untuk menjalankan program, mengelola input pengguna, dan memanggil metode di kelas `ParkingTicketMachine`.

#### Metode `main()`:
1. **Membuat Objek `ParkingTicketMachine`:**
   ```java
   ParkingTicketMachine machine = new ParkingTicketMachine(5000);
   ```
   Objek `ParkingTicketMachine` dibuat dengan harga tiket Rp5.000 per jam.

2. **Scanner untuk Input Pengguna:**
   ```java
   Scanner scanner = new Scanner(System.in);
   int choice;
   ```
   Scanner digunakan untuk menerima input dari pengguna.

3. **Menu Interaktif:**
   ```java
   do {
       System.out.println("\n==== Parking Ticket Machine ====");
       System.out.println("1. Masukkan Uang");
       System.out.println("2. Keluarkan Tiket");
       System.out.println("3. Keluar");
       System.out.print("Pilih opsi (1/2/3): ");
       choice = scanner.nextInt();
   ```
   - Sebuah loop `do-while` digunakan untuk menampilkan menu yang memungkinkan pengguna untuk memilih salah satu dari tiga opsi:
     1. Masukkan uang.
     2. Keluarkan tiket.
     3. Keluar dari program.

4. **Switch-Case untuk Memproses Input Pengguna:**
   ```java
   switch (choice) {
       case 1:
           System.out.print("Masukkan jumlah uang (Rp): ");
           int amount = scanner.nextInt();
           machine.insertMoney(amount);
           break;
       case 2:
           machine.issueTicket();
           System.out.println("Waktu parkir yang dibeli: " + machine.getTimePurchased() + " jam.");
           break;
       case 3:
           System.out.println("Terima kasih telah menggunakan mesin tiket parkir.");
           break;
       default:
           System.out.println("Pilihan tidak valid. Silakan coba lagi.");
   }
   ```
   - Berdasarkan input pengguna (`choice`), program akan:
     - Meminta pengguna untuk memasukkan uang dan menambahkannya ke saldo (`insertMoney()`).
     - Mengeluarkan tiket jika saldo cukup (`issueTicket()`).
     - Keluar dari program jika pengguna memilih opsi 3.
     - Jika input pengguna tidak valid, pesan kesalahan akan muncul.

5. **Loop Berakhir saat Pengguna Memilih Keluar:**
   ```java
   } while (choice != 3);
   scanner.close();
   ```
   - Loop akan berulang hingga pengguna memilih untuk keluar dari program (ketika pilihan adalah 3).

---
