import java.util.List;

public class Fox extends Animal {
    public Fox(Field field, Location location) {
        super(field, location);
    }

    @Override
    public void act(List<Animal> newAnimals) {
        if (isAlive()) {
            // Cari lokasi kosong di sekitar
            Location newLocation = field.freeAdjacentLocation(location);
            if (newLocation != null) {
                setLocation(newLocation); // Pindahkan ke lokasi baru
            } else {
                setDead(); // Jika tidak ada tempat, Fox mati
            }
        }
    }
}
