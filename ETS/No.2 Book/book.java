// Kelas Book
class Book {
    // Atribut kelas
    String judul;
    String penulis;
    int tahunTerbit;
    String penerbit;
    String kategori;

    // Konstruktor untuk menginisialisasi atribut
    public Book(String judul, String penulis, int tahunTerbit, String penerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.kategori = kategori;
    }

    // Metode untuk mencetak detail buku
    public void printDetails() {
        System.out.println("Judul Buku   : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Penerbit     : " + penerbit);
        System.out.println("Kategori     : " + kategori);
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Book menggunakan konstruktor
        Book buku1 = new Book("Laskar Pelangi", "Andrea Hirata", 2005, "Bentang Pustaka", "Novel");
        Book buku2 = new Book("Clean Code", "Robert C. Martin", 2008, "Prentice Hall", "Programming");

        // Memanggil metode printDetails untuk mencetak detail buku
        buku1.printDetails();
        System.out.println(); // Memisahkan output buku1 dan buku2
        buku2.printDetails();
    }
}
