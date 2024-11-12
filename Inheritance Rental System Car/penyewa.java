public class Penyewa {
    private String nama;
    private Kendaraan kendaraanDisewa;
    private int durasiSewa; // durasi sewa dalam hari

    public Penyewa(String nama, Kendaraan kendaraanDisewa, int durasiSewa) {
        this.nama = nama;
        this.kendaraanDisewa = kendaraanDisewa;
        this.durasiSewa = durasiSewa;
    }

    public String info() {
        return "Nama Penyewa: " + nama + ", Durasi Sewa: " + durasiSewa + " hari, Kendaraan Disewa: [" + kendaraanDisewa.info() + "]";
    }
}
