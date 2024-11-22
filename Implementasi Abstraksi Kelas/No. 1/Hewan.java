// Kelas Hewan
public class Hewan extends MakhlukHidup {
    @Override
    public void bernafas() {
        System.out.println("Hewan bernafas menggunakan paru-paru atau insang.");
    }

    @Override
    public void makan() {
        System.out.println("Hewan makan tumbuhan atau daging.");
    }
}
