### 1. **Deklarasi Kelas dan Variabel**
```java
public class MazeCommand {
    private String commandWord;
    private String secondWord;
```
- **`MazeCommand`**: Kelas ini menyimpan informasi mengenai perintah yang diberikan pemain.
- **`commandWord`**: Variabel ini menyimpan kata perintah utama yang diinput oleh pemain, seperti `"go"`, `"quit"`, atau `"help"`.
- **`secondWord`**: Variabel ini menyimpan kata kedua dari perintah yang diinput, yang bisa berupa arahan tambahan (misalnya, dalam perintah `"go north"`, kata kedua adalah `"north"`).

### 2. **Konstruktor `MazeCommand`**
```java
public MazeCommand(String commandWord, String secondWord) {
    this.commandWord = commandWord;
    this.secondWord = secondWord;
}
```
- **`MazeCommand(String commandWord, String secondWord)`**: Konstruktor ini digunakan untuk membuat objek `MazeCommand`, dan menerima dua parameter: 
  - **`commandWord`**: Kata perintah utama yang diinput oleh pemain.
  - **`secondWord`**: Kata kedua yang mungkin diinput oleh pemain sebagai informasi tambahan.
  
  Setelah objek dibuat, kedua parameter ini akan disimpan dalam variabel kelas yang sesuai.

### 3. **Metode `getCommandWord`**
```java
public String getCommandWord() {
    return commandWord;
}
```
- **`getCommandWord()`**: Metode ini mengembalikan nilai dari variabel `commandWord`, yaitu perintah utama yang diinput oleh pemain. Ini digunakan dalam permainan untuk memproses perintah pemain (misalnya, "go", "quit", "help").

### 4. **Metode `getSecondWord`**
```java
public String getSecondWord() {
    return secondWord;
}
```
- **`getSecondWord()`**: Metode ini mengembalikan nilai dari variabel `secondWord`, yaitu kata kedua yang mungkin diinput oleh pemain (misalnya, dalam perintah `"go north"`, "north" adalah kata kedua).

### 5. **Metode `isUnknown`**
```java
public boolean isUnknown() {
    return (commandWord == null);
}
```
- **`isUnknown()`**: Metode ini memeriksa apakah `commandWord` bernilai `null`. Jika `commandWord` bernilai `null`, berarti perintah yang diberikan oleh pemain tidak dikenali atau tidak valid. Metode ini digunakan untuk memeriksa apakah permainan menerima perintah yang tidak dikenali, sehingga dapat memberikan pesan kesalahan kepada pemain (misalnya, "I don't understand...").

### 6. **Metode `hasSecondWord`**
```java
public boolean hasSecondWord() {
    return (secondWord != null);
}
```
- **`hasSecondWord()`**: Metode ini memeriksa apakah ada kata kedua yang diinput oleh pemain (dengan memeriksa apakah `secondWord` bernilai tidak `null`). Ini berguna ketika perintah memerlukan informasi tambahan, seperti arah dalam perintah `go`. Jika kata kedua tidak ada, permainan bisa memberikan pesan yang relevan seperti "Go where?".
