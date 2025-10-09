# Laporan Praktikum Minggu 1 
Topik:Pengenalan Paradigma dan Setup Proyek

## Identitas
- Nama  : irwandi isnugroho
- NIM   : 240202867
- Kelas : 3IKKA

---

## Tujuan
Mahasiswa mampu mendefinisikan paradigma prosedural, OOP, dan fungsional.
Mahasiswa mampu membandingkan kelebihan dan keterbatasan tiap paradigma.
Mahasiswa mampu memberikan contoh program sederhana untuk masing-masing paradigma.
Mahasiswa aktif dalam diskusi kelas (bertanya, menjawab, memberi opini).

---

## Dasar Teori
Prosedural: program dibangun sebagai rangkaian perintah (fungsi/prosedur).
OOP (Object-Oriented Programming): program dibangun dari objek yang memiliki data (atribut) dan perilaku (method).
Fungsional: program dipandang sebagai pemetaan fungsi matematika, lebih menekankan ekspresi dan transformasi data.
Dalam konteks Agri-POS, OOP membantu memodelkan entitas nyata seperti Produk, Transaksi, dan Pembayaran sebagai objek. Dengan demikian, sistem lebih mudah dikembangkan dan dipelihara.

---

## Langkah Praktikum
Setup Project

Pastikan sudah menginstall JDK (Java Development Kit), IDE (misal: IntelliJ IDEA, VS Code, NetBeans), Git, PostgreSQL, dan JavaFX di komputer.
Buat folder project oop-pos-<nim>.
Inisialisasi repositori Git.
Buat struktur awal src/main/java/com/upb/agripos/.
Pastikan semua tools dapat berjalan (uji dengan membuat dan menjalankan program Java sederhana).
Program Sederhana dalam 3 Paradigma

Prosedural: program untuk menghitung total harga dua produk.
OOP: class Produk dengan atribut nama dan harga, buat minimal tiga objek, lalu hitung total.
Fungsional: gunakan Stream atau lambda untuk menghitung total harga dari minimal tiga objek.
Commit dan Push

Commit dengan pesan: week1-setup-hello-pos.

---

## Kode Program

// HelloProcedural.java

public class HelloProcedural {

    public static void main(String[] args) {
        String nim = "240202867";
        String nama = "Irwandi isnugroho";
        String[] produk = {"Beras", "Pupuk", "Benih"};
        int[] harga = {10000, 15000, 12000};
        int total = 0;
        System.out.println("Hello POS World");
        System.out.println("NIM: " + nim + ", Nama: " + nama);
        System.out.println("Daftar Produk:");
        for (int i = 0; i < produk.length; i++) {
            System.out.println("- " + produk[i] + ": " + harga[i]);
            total += harga[i];
        }
        System.out.println("Total harga semua produk: " + total);
    }
}

// HelloFunctional.java

import java.util.*;
import java.util.stream.*;

public class HelloFunctional {

    public static void main(String[] args) {
        String nim = "240202867";
        String nama = "Irwandi isnugroho";
        List<String> produk = Arrays.asList("Beras", "Pupuk", "Benih");
        List<Integer> harga = Arrays.asList(10000, 15000, 12000);
        System.out.println("Hello POS World");
        System.out.println("NIM: " + nim + ", Nama: " + nama);
        System.out.println("Daftar Produk:");
        IntStream.range(0, produk.size())
                .forEach(i -> System.out.println("- " + produk.get(i) + ": " + harga.get(i)));
        int total = harga.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total harga semua produk: " + total);
    }
}

// HelloOOP.java

class Produk {

    String nama;
    int harga;

    Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

public class HelloOOP {

    public static void main(String[] args) {
        String nim = "240202867";
        String namaMhs = "Irwandi isnugroho";
        Produk[] daftar = {
            new Produk("Beras", 10000),
            new Produk("Pupuk", 15000),
            new Produk("Benih", 12000)
        };
        int total = 0;
        System.out.println("Hello POS World");
        System.out.println("NIM: " + nim + ", Nama: " + namaMhs);
        System.out.println("Daftar Produk:");
        for (Produk p : daftar) {
            System.out.println("- " + p.nama + ": " + p.harga);
            total += p.harga;
        }
        System.out.println("Total harga semua produk: " + total);
    }
}

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis

1 Class & Object: Produk digunakan sebagai blueprint untuk membuat objek produk.
2 Encapsulation sederhana: data nama dan harga disimpan dalam objek.
3 Reusability: kamu bisa menambah produk baru cukup dengan new Produk(...) tanpa ubah struktur utama program.
---

## Kesimpulan
Konsep OOP memungkinkan data dan perilaku digabungkan dalam satu kesatuan (objek), sehingga pengelolaan data seperti daftar produk pada aplikasi POS menjadi lebih rapi dan efisien.
---

## Quiz
(1. Tidak selalu. OOP lebih baik digunakan ketika program memiliki banyak objek yang saling berinteraksi dan membutuhkan struktur yang mudah diperluas. Namun, untuk program kecil atau tugas sederhana dengan alur linier, paradigma prosedural bisa lebih efisien dan mudah dipahami.

2. Functional programming lebih cocok digunakan ketika program membutuhkan pemrosesan data yang bersifat paralel, tidak bergantung pada state, dan fokus pada transformasi data — misalnya pada aplikasi data analysis, machine learning, atau sistem yang menuntut high concurrency.
3.Prosedural: mudah untuk proyek kecil, tapi sulit dikembangkan dan dipelihara saat kompleksitas meningkat.
OOP: meningkatkan maintainability dan scalability karena memecah sistem menjadi objek-objek modular yang mudah diperbarui.
Fungsional: memudahkan maintenance dengan kode yang bebas efek samping dan mudah diuji, serta mendukung scalability lewat pemrosesan paralel.

4.Karena aplikasi POS memiliki banyak entitas seperti produk, pelanggan, transaksi, dan kasir yang dapat direpresentasikan sebagai objek dengan atribut dan perilaku sendiri. Dengan OOP, hubungan antarobjek dapat dikelola dengan rapi, kode lebih mudah dikembangkan, dan fitur baru bisa ditambahkan tanpa mengubah struktur utama.

5.Paradigma fungsional menggunakan fungsi murni, higher-order function, dan konsep seperti map, filter, dan reduce untuk menghindari penulisan kode berulang. Hal ini membuat kode lebih ringkas, deklaratif, dan mudah dipelihara karena logika umum bisa di-reuse tanpa menulis ulang prosedur yang sama.
