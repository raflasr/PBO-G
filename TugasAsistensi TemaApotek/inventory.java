import java.util.HashMap;
import java.util.Map;

class Inventory implements Storable {
    private Map<String, Integer> itemMap; // Map untuk menyimpan nama item dan jumlahnya
    private int totalItem; // Variabel untuk melacak total jumlah item di inventory

    // Constructor untuk menginisialisasi itemMap
    public Inventory() {
        itemMap = new HashMap<>();
        totalItem = 0;
    }

    // Implementasi metode tambahItem
    @Override
    public void tambahItem(String item, int jumlah) {
        if(itemMap.containsKey(item)) {
            // Jika item sudah ada, tambahkan jumlahnya
            itemMap.put(item, itemMap.get(item) + jumlah);
        } else {
            // Jika item belum ada, tambahkan item baru
            itemMap.put(item, jumlah);
        }
        totalItem += jumlah;
        System.out.println(jumlah + " " + item + " berhasil ditambahkan.");
    }

    // Implementasi metode hapusItem
    @Override
    public void hapusItem(String item) {
        if(itemMap.containsKey(item)) {
            totalItem -= itemMap.get(item); // Kurangi total jumlah item
            itemMap.remove(item); // Hapus item dari map
            System.out.println(item + " berhasil dihapus dari inventaris.");
        } else {
            System.out.println(item + " tidak ditemukan di inventaris.");
        }
    }

    // Implementasi metode tampilkanItem
    @Override
    public void tampilkanItem() {
        System.out.println("Daftar item di inventaris:");
        for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Total item: " + totalItem);
    }
}
