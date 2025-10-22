# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: prwktikum week 2 "Class dan Object"]

## Identitas
- Nama  : irwandi isnugroho
- NIM   : 24020687
- Kelas : 3ikka

---

## Tujuan
Mahasiswa mampu menjelaskan konsep class, object, atribut, dan method dalam OOP.
Mahasiswa mampu menerapkan access modifier dan enkapsulasi dalam pembuatan class.
Mahasiswa mampu mengimplementasikan class Produk pertanian dengan atribut dan method yang sesuai.
Mahasiswa mampu mendemonstrasikan instansiasi object serta menampilkan data produk pertanian di console.
Mahasiswa mampu menyusun laporan praktikum dengan bukti kode, hasil eksekusi, dan analisis sederhana.


---

## Dasar Teori

Class adalah blueprint atau cetak biru dari sebuah objek. Objek merupakan instansiasi dari class yang berisi atribut (data) dan method (perilaku). Dalam OOP, enkapsulasi dilakukan dengan menyembunyikan data menggunakan access modifier (public, private, protected) serta menyediakan akses melalui getter dan setter.

Dalam konteks Agri-POS, produk pertanian seperti benih, pupuk, dan alat pertanian dapat direpresentasikan sebagai objek yang memiliki atribut nama, harga, dan stok. Dengan menggunakan class, setiap produk dapat dibuat, dikelola, dan dimanipulasi secara lebih terstruktur.

---

## Langkah Praktikum
Membuat Class Produk

Buat file Produk.java pada package model.
Tambahkan atribut: kode, nama, harga, dan stok.
Gunakan enkapsulasi dengan menjadikan atribut bersifat private dan membuat getter serta setter untuk masing-masing atribut.
Membuat Class CreditBy

Buat file CreditBy.java pada package util.
Isi class dengan method statis untuk menampilkan identitas mahasiswa di akhir output: credit by: <NIM> - <Nama>.
Membuat Objek Produk dan Menampilkan Credit

Buat file MainProduk.java.
Instansiasi minimal tiga objek produk, misalnya "Benih Padi", "Pupuk Urea", dan satu produk alat pertanian.
Tampilkan informasi produk melalui method getter.
Panggil CreditBy.print("<NIM>", "<Nama>") di akhir main untuk menampilkan identitas.
Commit dan Push

Commit dengan pesan: week2-class-object.

## Kode Program
package com.upb.agripos;

import com.upb.agripos.model.Produk;
import com.upb.agripos.util.CreditBy;

public class MainProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("BNH-001", "Benih Padi IR64", 25000, 100);
        Produk p2 = new Produk("PPK-101", "Pupuk Urea 50kg", 350000, 40);
        Produk p3 = new Produk("ALT-501", "Cangkul Baja", 90000, 15);

        System.out.println("Kode: " + p1.getKode() + ", Nama: " + p1.getNama() + ", Harga: " + p1.getHarga() + ", Stok: " + p1.getStok());
        System.out.println("Kode: " + p2.getKode() + ", Nama: " + p2.getNama() + ", Harga: " + p2.getHarga() + ", Stok: " + p2.getStok());
        System.out.println("Kode: " + p3.getKode() + ", Nama: " + p3.getNama() + ", Harga: " + p3.getHarga() + ", Stok: " + p3.getStok());

        // Tampilkan identitas mahasiswa
        CreditBy.print("<24020867>", "<irwandi isnugroho>");
    }
}

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
Deklarasi dan Inisialisasi: Memori dialokasikan untuk tiga objek Produk.

Akses Data: Data dibaca menggunakan getter dan dicetak.

Perubahan Perilaku (Opsional): Data dimodifikasi secara terkontrol melalui method tambahStok/kurangiStok.

Terminasi: Program memanggil method statis untuk menampilkan kredit dan kemudian selesai (berhenti).
---

## Kesimpulan
Praktikum pada Bab 2 ini telah berhasil mencapai semua Tujuan Pembelajaran dengan mengimplementasikan konsep dasar Pemrograman Berorientasi Objek (PBO) dalam konteks sederhana aplikasi Agri-POS.

---

## Quiz
(1. [Mengapa atribut sebaiknya dideklarasikan sebagai private dalam class?
Jawaban: …Proteksi Data: Mencegah akses langsung dan modifikasi atribut dari luar class. Ini memastikan data internal objek hanya dapat diubah melalui method yang telah ditentukan (setter), bukan secara sewenwang-wenang.

2.Apa fungsi getter dan setter dalam enkapsulasi?
Jawaban: …Kontrol Integritas Data: Memungkinkan developer untuk menambahkan logika validasi di dalam method setter. Misalnya, stok tidak boleh diatur ke nilai negatif, atau harga tidak boleh nol. Jika atribut diakses langsung, validasi ini tidak dapat dipaksakan.

3.Bagaimana cara class Produk mendukung pengembangan aplikasi POS yang lebih kompleks?
Jawaban: …Fleksibilitas (Maintenance): Memungkinkan Anda mengubah implementasi internal class (misalnya, mengganti tipe data atribut) tanpa memengaruhi kode di luar class yang menggunakannya. Selama signature dari getter dan setter tetap sama, kode luar tidak perlu diubah.
