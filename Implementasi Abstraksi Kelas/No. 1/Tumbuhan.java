// Kelas Tumbuhan
public class Tumbuhan extends MakhlukHidup {
    @Override
    public void bernafas() {
        System.out.println("Tumbuhan bernafas menggunakan stomata.");
    }

    @Override
    public void makan() {
        System.out.println("Tumbuhan membuat makanan sendiri melalui fotosintesis.");
    }
}
