### 1. **Deklarasi Kelas**
```java
public class MazeRoom {
    private String description;
    private MazeRoom northExit, southExit, eastExit, westExit;
```
- **Kelas `MazeRoom`**: Ini adalah sebuah blueprint untuk objek `MazeRoom`, di mana setiap objek memiliki properti `description` (deskripsi ruangan) dan beberapa properti untuk menyimpan rujukan ke ruangan lain di arah tertentu: `northExit`, `southExit`, `eastExit`, dan `westExit`.
- **`private`**: Kata kunci ini menunjukkan bahwa variabel-variabel tersebut hanya bisa diakses dari dalam kelas ini (enkapsulasi). Variabel-variabel ini menyimpan deskripsi dan arah keluar (exit) dari ruangan tersebut.

### 2. **Konstruktor Kelas**
```java
    public MazeRoom(String description) {
        this.description = description;
    }
```
- **Konstruktor `MazeRoom(String description)`**: Ini adalah metode khusus yang digunakan untuk membuat objek baru dari kelas `MazeRoom`. Ketika objek dibuat, pengguna bisa memberikan deskripsi ruangan, dan deskripsi tersebut akan disimpan dalam variabel `description` dari objek tersebut.
- **`this.description`**: `this` merujuk pada objek saat ini, dan di sini digunakan untuk membedakan antara parameter `description` dan variabel instance `description` dari kelas.

### 3. **Metode `setExits`**
```java
    public void setExits(MazeRoom north, MazeRoom south, MazeRoom east, MazeRoom west) {
        northExit = north;
        southExit = south;
        eastExit = east;
        westExit = west;
    }
```
- **Metode `setExits`**: Metode ini digunakan untuk mengatur rujukan ruangan di empat arah: utara, selatan, timur, dan barat.
- **Parameter**: Parameter `north`, `south`, `east`, dan `west` adalah objek-objek `MazeRoom` yang akan dijadikan sebagai ruangan keluar di arah tersebut.
- Setelah dipanggil, setiap variabel arah (`northExit`, `southExit`, `eastExit`, `westExit`) akan menunjuk pada ruangan lain yang terhubung.

### 4. **Metode `getDescription`**
```java
    public String getDescription() {
        return description;
    }
```
- **Metode `getDescription()`**: Ini adalah metode untuk mendapatkan deskripsi ruangan. Metode ini mengembalikan (return) nilai dari variabel `description`, yang bisa digunakan untuk mengetahui informasi tentang ruangan tersebut.

### 5. **Metode `getExit`**
```java
    public MazeRoom getExit(String direction) {
        if(direction.equals("north")) return northExit;
        if(direction.equals("south")) return southExit;
        if(direction.equals("east")) return eastExit;
        if(direction.equals("west")) return westExit;
        return null;
    }
```
- **Metode `getExit(String direction)`**: Metode ini menerima sebuah parameter berupa `direction` (arah) yang merupakan string. Metode ini mengembalikan ruangan keluar (`MazeRoom`) yang terhubung ke arah tersebut. Jika arah tidak sesuai dengan salah satu dari `"north"`, `"south"`, `"east"`, atau `"west"`, maka metode ini akan mengembalikan `null` (artinya tidak ada ruangan di arah tersebut).
- **`if` statement**: Menggunakan struktur `if` untuk memeriksa nilai dari `direction` dan mengembalikan ruangan yang terkait dengan arah tersebut.
