### 1. **Deklarasi Kelas dan Variabel**
```java
public class MazeCommandWords {
    private String[] validCommands;
```
- **`MazeCommandWords`**: Kelas ini menyimpan daftar perintah yang valid untuk permainan, dan berfungsi untuk memeriksa apakah sebuah input dari pemain adalah perintah yang sah.
- **`validCommands`**: Sebuah array tipe `String` yang menyimpan semua perintah yang dianggap sah. Pada contoh ini, perintah yang valid adalah `"go"`, `"quit"`, dan `"help"`.

### 2. **Konstruktor `MazeCommandWords`**
```java
    public MazeCommandWords() {
        validCommands = new String[] { "go", "quit", "help" };
    }
```
- **`MazeCommandWords()`**: Konstruktor ini akan dipanggil saat sebuah objek `MazeCommandWords` dibuat. Di dalam konstruktor, array `validCommands` diisi dengan tiga perintah yang valid: `"go"`, `"quit"`, dan `"help"`. Array ini adalah daftar perintah yang dapat digunakan oleh pemain dalam permainan.
  - `"go"`: Perintah untuk berpindah ke ruangan lain.
  - `"quit"`: Perintah untuk keluar dari permainan.
  - `"help"`: Perintah untuk meminta bantuan, biasanya untuk melihat daftar perintah yang tersedia.

### 3. **Metode `isCommand`**
```java
    public boolean isCommand(String aString) {
        for (String command : validCommands) {
            if (command.equals(aString)) {
                return true;
            }
        }
        return false;
    }
```
- **`isCommand(String aString)`**: Metode ini digunakan untuk memeriksa apakah string `aString` yang diterima sebagai parameter merupakan salah satu perintah yang valid. Fungsi ini mengembalikan nilai `true` jika `aString` adalah perintah yang sah, dan `false` jika tidak.

  **Langkah-langkah yang terjadi dalam metode ini:**
  1. **`for (String command : validCommands)`**: Loop ini berfungsi untuk memeriksa setiap elemen dalam array `validCommands`.
  2. **`if (command.equals(aString))`**: Jika salah satu perintah di dalam array `validCommands` sama dengan string `aString`, maka kondisi ini terpenuhi.
  3. **`return true`**: Jika perintah yang cocok ditemukan, metode akan segera mengembalikan `true` yang menandakan bahwa `aString` adalah perintah yang valid.
  4. **`return false`**: Jika loop selesai dan tidak ada perintah yang cocok dengan `aString`, metode akan mengembalikan `false`, yang menunjukkan bahwa input dari pemain bukan perintah yang valid.
