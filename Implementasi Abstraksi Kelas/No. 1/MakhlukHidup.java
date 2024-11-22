// Abstract Class MakhlukHidup
public abstract class MakhlukHidup {
    // Metode abstrak (harus diimplementasikan oleh kelas turunan)
    public abstract void bernafas();
    public abstract void makan();

    // Metode umum (bisa digunakan langsung oleh kelas turunan)
    public void tumbuh() {
        System.out.println("Makhluk hidup tumbuh berkembang.");
    }
}
