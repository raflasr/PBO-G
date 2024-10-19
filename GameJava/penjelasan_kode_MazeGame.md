### 1. **Deklarasi Kelas**
```java
public class MazeGame {
    private MazeParser parser;
    private MazeRoom currentRoom;
```
- **`MazeGame`**: Kelas utama yang mengontrol jalannya permainan.
- **`parser`**: Variabel dari tipe `MazeParser`, digunakan untuk membaca dan mengurai perintah pemain.
- **`currentRoom`**: Variabel dari tipe `MazeRoom`, menyimpan ruangan di mana pemain berada saat ini.

### 2. **Konstruktor `MazeGame`**
```java
public MazeGame() {
    createRooms();
    parser = new MazeParser();
}
```
- **Konstruktor `MazeGame()`**: Ketika objek `MazeGame` dibuat, konstruktor ini dipanggil. Di dalamnya:
  - **`createRooms()`**: Memanggil metode ini untuk membuat semua ruangan di dalam maze dan menghubungkan ruangan-ruangan tersebut.
  - **`parser = new MazeParser();`**: Membuat objek `MazeParser` untuk memproses perintah pemain.

### 3. **Metode `createRooms`**
```java
private void createRooms() {
    MazeRoom entrance = new MazeRoom("at the entrance of a dark maze");
    MazeRoom hall = new MazeRoom("in a long, narrow hall");
    MazeRoom chamber = new MazeRoom("inside a vast, echoing chamber");
    MazeRoom exit = new MazeRoom("at the maze's exit, you see light!");

    entrance.setExits(hall, null, null, null);
    hall.setExits(chamber, entrance, null, null);
    chamber.setExits(exit, hall, null, null);
    exit.setExits(null, null, null, null);

    currentRoom = entrance;  // Start game at the maze entrance
}
```
- **`createRooms()`**: Metode ini digunakan untuk membuat objek `MazeRoom`, yang merepresentasikan ruangan-ruangan di dalam maze, beserta hubungannya (arah keluar).
  - Beberapa ruangan diciptakan: `entrance`, `hall`, `chamber`, dan `exit`, masing-masing dengan deskripsi yang menggambarkan lokasinya.
  - **`setExits()`**: Menghubungkan ruangan satu sama lain dengan menentukan arah keluar (north, south, east, west). Misalnya, ruangan `entrance` memiliki pintu keluar ke utara yang menuju `hall`.
  - **`currentRoom`**: Pemain memulai permainan di ruangan `entrance`, sehingga variabel ini diatur ke `entrance`.

### 4. **Metode `play`**
```java
public void play() {
    printWelcome();

    boolean finished = false;
    while (!finished) {
        MazeCommand command = parser.getCommand();
        finished = processCommand(command);
    }
    System.out.println("Thank you for playing. Goodbye.");
}
```
- **`play()`**: Metode utama yang menjalankan loop permainan. 
  - **`printWelcome()`**: Menampilkan pesan sambutan kepada pemain.
  - **`while (!finished)`**: Loop ini terus berjalan sampai pemain memilih untuk keluar dari permainan (saat `finished` bernilai `true`).
  - **`parser.getCommand()`**: Mengambil input perintah dari pemain melalui metode `getCommand()` dari objek `MazeParser`.
  - **`processCommand(command)`**: Memproses perintah yang diberikan pemain dan menentukan apakah permainan berakhir (misalnya, jika pemain mengetik perintah `quit`).
  - Ketika loop berakhir, permainan berterima kasih kepada pemain dan menampilkan pesan perpisahan.

### 5. **Metode `printWelcome`**
```java
private void printWelcome() {
    System.out.println("Welcome to Escape the Maze!");
    System.out.println("Type 'help' if you need help.");
    System.out.println("You are " + currentRoom.getDescription());
    System.out.println();
}
```
- **`printWelcome()`**: Menampilkan pesan sambutan, memberikan petunjuk kepada pemain bahwa mereka bisa mengetik "help", dan menunjukkan deskripsi dari ruangan tempat mereka berada saat ini.

### 6. **Metode `processCommand`**
```java
private boolean processCommand(MazeCommand command) {
    if (command.isUnknown()) {
        System.out.println("I don't understand...");
        return false;
    }

    String commandWord = command.getCommandWord();
    if (commandWord.equals("help")) {
        printHelp();
    } else if (commandWord.equals("go")) {
        goRoom(command);
    } else if (commandWord.equals("quit")) {
        return true;
    }

    return false;
}
```
- **`processCommand(MazeCommand command)`**: Memproses perintah yang diinput oleh pemain.
  - **`command.isUnknown()`**: Jika perintah tidak dikenali, menampilkan pesan kesalahan "I don't understand..." dan mengembalikan `false` agar permainan terus berjalan.
  - **Perintah `help`**: Jika pemain mengetik `help`, maka metode `printHelp()` akan dipanggil untuk memberikan daftar perintah yang tersedia.
  - **Perintah `go`**: Jika pemain mengetik perintah `go`, metode `goRoom()` akan dipanggil untuk menggerakkan pemain ke ruangan yang dituju.
  - **Perintah `quit`**: Jika pemain mengetik `quit`, permainan akan berakhir dengan mengembalikan `true`.

### 7. **Metode `printHelp`**
```java
private void printHelp() {
    System.out.println("You can use the following commands: go, quit, help");
    System.out.println("To move: go north, go south, go east, go west.");
}
```
- **`printHelp()`**: Menampilkan daftar perintah yang tersedia kepada pemain, seperti `go`, `quit`, dan `help`.

### 8. **Metode `goRoom`**
```java
private void goRoom(MazeCommand command) {
    if (!command.hasSecondWord()) {
        System.out.println("Go where?");
        return;
    }

    String direction = command.getSecondWord();
    MazeRoom nextRoom = currentRoom.getExit(direction);

    if (nextRoom == null) {
        System.out.println("You can't go that way!");
    } else {
        currentRoom = nextRoom;
        System.out.println("You are " + currentRoom.getDescription());
    }
}
```
- **`goRoom(MazeCommand command)`**: Metode ini bertanggung jawab untuk memindahkan pemain ke ruangan lain berdasarkan arah yang diberikan.
  - **`command.hasSecondWord()`**: Memeriksa apakah pemain telah memberikan kata kedua (arah) setelah `go`. Jika tidak ada, ditampilkan pesan "Go where?".
  - **`getExit(direction)`**: Memeriksa apakah ada ruangan di arah yang diberikan. Jika tidak ada, ditampilkan pesan "You can't go that way!".
  - Jika ruangan ditemukan, pemain dipindahkan ke ruangan tersebut (`currentRoom = nextRoom`), dan deskripsi ruangan baru ditampilkan.
