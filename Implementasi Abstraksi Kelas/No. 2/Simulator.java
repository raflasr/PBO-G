import java.util.ArrayList;
import java.util.List;

public class Simulator {
    private static final int DEFAULT_DEPTH = 20;
    private static final int DEFAULT_WIDTH = 20;

    private List<Animal> animals;  // Daftar semua hewan (Fox dan Rabbit)
    private Field field;           // Field untuk simulasi
    private FieldStats stats;      // Statistik field

    // Constructor
    public Simulator() {
        this(DEFAULT_DEPTH, DEFAULT_WIDTH);
    }

    public Simulator(int depth, int width) {
        animals = new ArrayList<>();
        field = new Field(depth, width);
        stats = new FieldStats();
        populate(); // Isi field dengan Fox dan Rabbit
    }

    // Jalankan simulasi selama beberapa langkah
    public void simulate(int steps) {
        for (int step = 1; step <= steps; step++) {
            System.out.println("Step: " + step);
            simulateOneStep(); // Jalankan satu langkah simulasi
            printField();      // Cetak field ke konsol
            stats.printStatistics(field); // Cetak statistik ke konsol
        }
    }

    // Simulasikan satu langkah
    private void simulateOneStep() {
        List<Animal> newAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            animal.act(newAnimals); // Setiap hewan bertindak
        }
        animals.addAll(newAnimals); // Tambahkan hewan baru
        animals.removeIf(animal -> !animal.isAlive()); // Hapus hewan mati
    }

    // Cetak keadaan field ke konsol
    private void printField() {
        for (int row = 0; row < field.getDepth(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                Object animal = field.getObjectAt(row, col);
                if (animal instanceof Fox) {
                    System.out.print("F ");
                } else if (animal instanceof Rabbit) {
                    System.out.print("R ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Isi field secara acak dengan Fox dan Rabbit
    private void populate() {
        field.clear(); // Bersihkan field
        for (int row = 0; row < field.getDepth(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                if (Math.random() < 0.1) { // 10% Fox
                    Location location = new Location(row, col);
                    Fox fox = new Fox(field, location);
                    animals.add(fox);
                    field.place(fox, location);
                } else if (Math.random() < 0.3) { // 30% Rabbit
                    Location location = new Location(row, col);
                    Rabbit rabbit = new Rabbit(field, location);
                    animals.add(rabbit);
                    field.place(rabbit, location);
                }
            }
        }
    }
}
