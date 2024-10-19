### 1. **Deklarasi Kelas**
```java
public class MazeParser {
    private MazeCommandWords commandWords;
    private Scanner reader;
```
- **`MazeParser`**: Kelas ini berfungsi untuk mem-parsing (menguraikan) input dari pengguna dan mengubahnya menjadi perintah yang bisa digunakan oleh permainan.
- **`commandWords`**: Ini adalah variabel dari kelas `MazeCommandWords`, yang mungkin berfungsi untuk menyimpan daftar perintah yang sah dalam permainan (misalnya, perintah seperti "go", "quit", dll.).
- **`reader`**: Ini adalah variabel dari tipe `Scanner`, yang digunakan untuk membaca input dari pemain melalui terminal atau konsol.

### 2. **Konstruktor `MazeParser`**
```java
    public MazeParser() {
        commandWords = new MazeCommandWords();
        reader = new Scanner(System.in);
    }
```
- **`MazeParser()`**: Konstruktor ini di panggil ketika sebuah objek `MazeParser` dibuat. Di sini, dua objek diinisialisasi:
  - **`commandWords`**: Membuat objek `MazeCommandWords` untuk menyimpan atau memeriksa daftar kata perintah yang valid.
  - **`reader`**: Membuat objek `Scanner` yang akan digunakan untuk membaca input dari pengguna melalui konsol.
  
### 3. **Metode `getCommand`**
```java
    public MazeCommand getCommand() {
        System.out.print("> ");
        String inputLine = reader.nextLine();
        String[] words = inputLine.split(" ");
        
        String word1 = words[0];
        String word2 = (words.length > 1) ? words[1] : null;

        if (commandWords.isCommand(word1)) {
            return new MazeCommand(word1, word2);
        } else {
            return new MazeCommand(null, null);
        }
    }
```
- **Fungsi `getCommand()`**: Fungsi ini mengambil input dari pemain, mengurai input menjadi kata-kata, dan kemudian menghasilkan objek `MazeCommand` berdasarkan input tersebut.

  **Langkah-langkah detail:**
  1. **`System.out.print("> ");`**: Menampilkan prompt (">") di konsol untuk memberi tanda kepada pemain bahwa sistem sedang menunggu input.
  
  2. **`String inputLine = reader.nextLine();`**: Menggunakan `reader` (objek `Scanner`) untuk membaca satu baris input dari pengguna.
  
  3. **`String[] words = inputLine.split(" ");`**: Memecah baris input menjadi kata-kata terpisah berdasarkan spasi. Hasilnya adalah array string.
  
  4. **`String word1 = words[0];`**: Kata pertama dari input diambil sebagai perintah utama.
  
  5. **`String word2 = (words.length > 1) ? words[1] : null;`**: Jika ada kata kedua dalam input, kata kedua tersebut disimpan di `word2`; jika tidak, `word2` diset ke `null`. Ini karena beberapa perintah mungkin memiliki parameter kedua (misalnya, "go north").
  
  6. **`if (commandWords.isCommand(word1))`**: Di sini dicek apakah kata pertama (`word1`) merupakan perintah yang valid. Ini dilakukan dengan memanggil metode `isCommand` dari objek `commandWords`, yang mungkin berisi daftar perintah yang sah dalam permainan.
  
  7. **`return new MazeCommand(word1, word2);`**: Jika kata pertama (`word1`) adalah perintah yang valid, maka metode ini akan mengembalikan sebuah objek `MazeCommand`, yang terdiri dari perintah utama (`word1`) dan perintah sekunder atau parameter (`word2`, yang bisa jadi `null` jika tidak ada).
  
  8. **`else` block**: Jika kata pertama bukan perintah yang valid, maka sebuah `MazeCommand` dengan `null` sebagai perintah utama dan sekunder dikembalikan, yang menunjukkan bahwa tidak ada perintah yang valid yang diinput oleh pemain.
