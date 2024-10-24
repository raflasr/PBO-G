### 1. **Kelas `Book`**:
   - Kelas ini mewakili konsep sebuah **buku** dengan beberapa atribut penting.

#### Atribut:
   - `String judul`: Menyimpan judul buku.
   - `String penulis`: Menyimpan nama penulis buku.
   - `int tahunTerbit`: Menyimpan tahun terbit buku.
   - `String namaPenerbit`: Menyimpan nama penerbit buku.
   - `String kategoriBuku`: Menyimpan kategori atau jenis buku (misalnya, novel, nonfiksi, dll.).

#### Konstruktor:
```java
public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategoriBuku) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
    this.namaPenerbit = namaPenerbit;
    this.kategoriBuku = kategoriBuku;
}
```
   - Konstruktor ini bertugas untuk menginisialisasi objek `Book` ketika pertama kali dibuat. Ia menerima lima parameter (`judul`, `penulis`, `tahunTerbit`, `namaPenerbit`, dan `kategoriBuku`), dan memberikan nilai tersebut kepada atribut-atribut di dalam objek.
   - Kata kunci `this` digunakan untuk membedakan antara parameter yang dikirimkan ke konstruktor dan atribut kelas.

#### Metode `printDetails()`:
```java
public void printDetails() {
    System.out.println("Judul: " + judul);
    System.out.println("Penulis: " + penulis);
    System.out.println("Tahun Terbit: " + tahunTerbit);
    System.out.println("Nama Penerbit: " + namaPenerbit);
    System.out.println("Kategori Buku: " + kategoriBuku);
}
```
   - Metode ini digunakan untuk mencetak semua informasi tentang buku tersebut ke konsol. Ini akan memanggil setiap atribut dari objek yang dibuat dan mencetaknya dalam format yang mudah dibaca.

### 2. **Kelas `Main`**:
   - Kelas ini berfungsi sebagai titik awal program dan berisi metode `main` yang dijalankan oleh JVM (Java Virtual Machine) ketika program dimulai.

#### Metode `main`:
```java
public static void main(String[] args) {
    // Membuat objek Book menggunakan konstruktor
    Book buku1 = new Book("Sang Pemimpi", "Andrea Hirata", 2006, "Bentang Pustaka", "Novel");

    // Memanggil metode untuk mencetak detail buku
    buku1.printDetails();
}
```
   - Di sini, objek `buku1` dari kelas `Book` dibuat menggunakan konstruktor yang telah didefinisikan. Objek ini berisi data tentang buku "Sang Pemimpi" yang ditulis oleh Andrea Hirata, diterbitkan pada tahun 2006 oleh Bentang Pustaka, dan dikategorikan sebagai novel.
   - Setelah objek `buku1` dibuat, metode `printDetails()` dipanggil untuk mencetak informasi lengkap mengenai buku tersebut ke layar.

### Penjelasan Eksekusi:
1. **Membuat Objek**:
   Saat baris `Book buku1 = new Book("Sang Pemimpi", "Andrea Hirata", 2006, "Bentang Pustaka", "Novel");` dieksekusi, konstruktor akan dipanggil dan nilai-nilai tersebut akan diinisialisasi ke atribut-atribut objek `buku1`.
   
2. **Memanggil Metode**:
   Setelah objek berhasil dibuat, metode `printDetails()` dipanggil, yang akan mencetak semua informasi yang disimpan dalam objek `buku1`.
