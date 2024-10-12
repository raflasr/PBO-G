Kelompok 9 anggota :
| Name           | NRP        | Kelas     |
| ---            | ---        | ----------|
| Rafaela Shyra Ashma' Ramadhani | 5025231217 | Pemrograman Berorientasi Objek (G) |
| Triana Velia Hutabalian | 5025231190 | Pemrograman Berorientasi Objek (G) |

Tema : Apotek

Penjelasan Kode
1. Interface Storable
   
   Mendefinisikan tiga metode untuk menambah, menghapus, dan menampilkan item dalam inventaris apotek. Interface ini mengatur kontrak bahwa setiap class yang mengimplementasikannya harus menyediakan implementasi dari ketiga metode tersebut.
2. Class Inventory
   - Menggunakan Map<String, Integer> untuk menyimpan item dengan key sebagai nama item dan value sebagai jumlah item.
   - Metode tambahItem akan menambahkan item ke map. Jika item sudah ada, jumlah item ditambahkan, dan jika belum ada, item baru akan dimasukkan ke dalam map.
   - Metode hapusItem akan menghapus item dari map. Jika item tidak ditemukan, pesan akan ditampilkan.
   - Metode tampilkanItem menampilkan semua item yang ada di inventaris beserta jumlahnya, serta total item di apotek.
3. Class Main
   - Memiliki menu interaktif yang menggunakan Scanner untuk mendapatkan input dari pengguna.
   - Program berulang hingga pengguna memilih opsi untuk keluar.

Diagram Class :

![Cuplikan layar 2024-10-12 154309](https://github.com/user-attachments/assets/ced11bcc-4af3-4bff-a984-f7289d0fdca7)


Output:
1. Menambahkan item obat
   
   ![Screenshot 2024-10-10 190131](https://github.com/user-attachments/assets/c3e6d573-f12f-4a5a-8fe3-e4bf98ab194d)
   ![Screenshot 2024-10-10 190140](https://github.com/user-attachments/assets/a1acc7e0-1fe6-459b-b7de-86dd1a01dd0a)
   ![Screenshot 2024-10-10 190148](https://github.com/user-attachments/assets/fbe65457-7d30-439d-987d-71f71f2962d2)

2. Menampilkan item obat
   
   ![Screenshot 2024-10-10 190202](https://github.com/user-attachments/assets/52b82579-17d1-46fe-aad5-b55f01cf205d)

3. Menghapus item obat
   
   ![Screenshot 2024-10-10 190221](https://github.com/user-attachments/assets/e048fdcc-bafc-48f1-a549-66e9ad0e0e5e)
   ![Screenshot 2024-10-10 190234](https://github.com/user-attachments/assets/6d7f3d0b-cd0f-459e-b828-51e750f34c20)

4. Mengakhiri program
   
   ![Screenshot 2024-10-10 190245](https://github.com/user-attachments/assets/4e755239-2497-458a-a1fb-44721a8ca643)
