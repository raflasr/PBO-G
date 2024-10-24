### 1. **Kelas `Book`**
Kelas ini merepresentasikan sebuah buku dengan atribut-atribut tertentu dan metode untuk mencetak detail buku.

#### Atribut:
- `String judul` : Menyimpan judul buku.
- `String penulis` : Menyimpan nama penulis buku.
- `int tahunTerbit` : Menyimpan tahun terbit buku.
- `String penerbit` : Menyimpan nama penerbit buku.
- `String kategori` : Menyimpan kategori atau jenis buku, misalnya "Novel", "Programming", dll.

#### Konstruktor:
```java
public Book(String judul, String penulis, int tahunTerbit, String penerbit, String kategori) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
    this.penerbit = penerbit;
    this.kategori = kategori;
}
```
- Konstruktor ini digunakan untuk menginisialisasi objek `Book` dengan nilai-nilai awal. Setiap kali Anda membuat objek `Book`, Anda harus memberikan nilai untuk atribut `judul`, `penulis`, `tahunTerbit`, `penerbit`, dan `kategori`.
- Keyword `this` digunakan untuk membedakan antara parameter yang diterima oleh konstruktor dengan atribut kelas. Misalnya, `this.judul` merujuk pada atribut kelas `judul`, sedangkan `judul` di sebelah kanan adalah parameter yang diberikan ke konstruktor.

#### Metode `printDetails()`:
```java
public void printDetails() {
    System.out.println("Judul Buku   : " + judul);
    System.out.println("Penulis      : " + penulis);
    System.out.println("Tahun Terbit : " + tahunTerbit);
    System.out.println("Penerbit     : " + penerbit);
    System.out.println("Kategori     : " + kategori);
}
```
- Metode ini berfungsi untuk mencetak detail dari sebuah objek `Book` dengan menampilkan informasi seperti judul, penulis, tahun terbit, penerbit, dan kategori buku.

### 2. **Kelas `Main`**
Kelas ini berfungsi sebagai titik awal untuk menjalankan program.

#### `main` method:
```java
public static void main(String[] args) {
    Book buku1 = new Book("Laskar Pelangi", "Andrea Hirata", 2005, "Bentang Pustaka", "Novel");
    Book buku2 = new Book("Clean Code", "Robert C. Martin", 2008, "Prentice Hall", "Programming");

    buku1.printDetails();
    System.out.println(); // Memisahkan output buku1 dan buku2
    buku2.printDetails();
}
```
- Pada metode `main`, dua objek `Book` dibuat, yaitu `buku1` dan `buku2`, masing-masing dengan nilai-nilai atribut yang diinisialisasi melalui konstruktor.
  - `buku1` mewakili buku "Laskar Pelangi" dengan penulis Andrea Hirata, diterbitkan tahun 2005 oleh Bentang Pustaka, dan berkategori Novel.
  - `buku2` mewakili buku "Clean Code" dengan penulis Robert C. Martin, diterbitkan tahun 2008 oleh Prentice Hall, dan berkategori Programming.
  
- Setelah membuat objek-objek tersebut, program memanggil metode `printDetails()` untuk mencetak detail buku ke konsol.
2. **Metode `printDetails()`**: Ini adalah metode untuk menampilkan informasi detail dari setiap objek buku.
3. **Pembuatan Objek**: Dua objek `Book` dibuat dengan nilai-nilai yang berbeda dan kemudian metode `printDetails()` dipanggil untuk menampilkan informasi dari masing-masing buku.

Dengan struktur ini, kita dapat dengan mudah membuat objek-objek baru dari kelas `Book` dengan nilai atribut yang berbeda dan mencetak detailnya dengan memanggil metode `printDetails()`.
