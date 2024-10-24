### 1. Kelas `MenuItem`

#### Deskripsi:
Kelas ini merepresentasikan item menu di restoran. Setiap item memiliki nama dan harga.

#### Anggota Kelas:
- **Atribut:**
  - `private String name`: Menyimpan nama item menu.
  - `private double price`: Menyimpan harga item menu.

- **Konstruktor:**
  - `public MenuItem(String name, double price)`: Menerima nama dan harga untuk membuat objek `MenuItem`.

- **Metode:**
  - `public String getName()`: Mengembalikan nama item menu.
  - `public double getPrice()`: Mengembalikan harga item menu.
  - `@Override public String toString()`: Mengembalikan representasi string dari objek `MenuItem`, yaitu nama dan harga item.

### 2. Kelas `FoodOrder`

#### Deskripsi:
Kelas ini merepresentasikan pesanan makanan yang dibuat oleh pengguna. Kelas ini menyimpan daftar item menu yang dipesan, total harga, dan status pembayaran.

#### Anggota Kelas:
- **Atribut:**
  - `private ArrayList<MenuItem> menuItems`: Menyimpan daftar item menu yang dipesan.
  - `private double totalPrice`: Menyimpan total harga pesanan.
  - `private boolean isPaid`: Menyimpan status apakah pesanan sudah dibayar.

- **Konstruktor:**
  - `public FoodOrder()`: Inisialisasi atribut dengan nilai default (daftar kosong, total harga 0.0, dan status belum dibayar).

- **Metode:**
  - `public void addMenuItem(MenuItem item)`: Menambahkan item menu ke pesanan dan menghitung ulang total harga.
  - `private void calculateTotal()`: Menghitung total harga dari semua item dalam pesanan.
  - `public void setPaid()`: Mengatur status pembayaran menjadi `true`.
  - `public double getTotalPrice()`: Mengembalikan total harga pesanan.
  - `public boolean isPaid()`: Mengembalikan status pembayaran.
  - `public void displayOrder()`: Menampilkan rincian pesanan, termasuk daftar item, total harga, dan status pembayaran.

### 3. Kelas `Main`

#### Deskripsi:
Kelas ini adalah kelas utama yang menjalankan program. Ini menangani interaksi dengan pengguna dan memproses pesanan makanan.

#### Metode `main`:
1. **Inisialisasi Daftar Menu:**
   - Membuat daftar item menu yang tersedia di restoran dengan menggunakan objek `MenuItem`.

2. **Interaksi dengan Pengguna:**
   - Menggunakan `Scanner` untuk membaca input dari pengguna.
   - Menggunakan loop `while` untuk menampilkan menu dan memungkinkan pengguna untuk memilih item untuk ditambahkan ke pesanan.
   - Pengguna dapat menambahkan item dengan memasukkan nomor item. Jika pengguna memasukkan `0`, loop akan berhenti, dan pesanan akan selesai.

3. **Menampilkan Total Harga:**
   - Setelah pesanan selesai, program menampilkan total harga pesanan menggunakan metode `displayOrder()`.

4. **Pembayaran:**
   - Meminta pengguna untuk memasukkan jumlah uang yang dibayarkan.
   - Memeriksa apakah jumlah yang dibayarkan mencukupi:
     - Jika cukup, menandai pesanan sebagai dibayar dan menghitung kembalian.
     - Jika tidak cukup, menampilkan jumlah yang masih harus dibayar.

5. **Menampilkan Rincian Pesanan Akhir:**
   - Menampilkan rincian akhir pesanan termasuk status pembayaran.
