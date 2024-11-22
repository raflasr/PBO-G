// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing kelas turunan
        MakhlukHidup manusia = new Manusia();
        MakhlukHidup hewan = new Hewan();
        MakhlukHidup tumbuhan = new Tumbuhan();

        // Memanggil metode dari objek-objek tersebut
        System.out.println("Manusia:");
        manusia.bernafas();
        manusia.makan();
        manusia.tumbuh();

        System.out.println("\nHewan:");
        hewan.bernafas();
        hewan.makan();
        hewan.tumbuh();

        System.out.println("\nTumbuhan:");
        tumbuhan.bernafas();
        tumbuhan.makan();
        tumbuhan.tumbuh();
    }
}
