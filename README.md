# 🎓 Mini Project: Program Data Mahasiswa

<p align="center">
  <b>📚 Pemrograman Berorientasi Objek (PBO)</b><br>
  Program Studi S1 Informatika<br>
  Fakultas Matematika dan Ilmu Pengetahuan Alam<br>
  Universitas Syiah Kuala
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk" alt="Java">
  <img src="https://img.shields.io/badge/Topic-Basic%20OOP-blue?style=for-the-badge" alt="Basic OOP">
  <img src="https://img.shields.io/badge/Status-Completed-success?style=for-the-badge" alt="Status">
</p>

---

## 👨‍🎓 Informasi Mahasiswa

| Keterangan | Detail |
|:---|:---|
| **Nama** | Nabil Al Fijar |
| **NIM** | 250810701100031 |
| **Program Studi** | S1 Informatika |
| **Fakultas** | Matematika dan Ilmu Pengetahuan Alam |
| **Universitas** | Universitas Syiah Kuala |
| **Dosen Pengampu** | Maulyanda, S.Tr.Kom., M.Kom. |

---

## 📌 Tentang Proyek

**Program Data Mahasiswa** adalah aplikasi berbasis Java sederhana yang dirancang untuk mengelola dan menampilkan data mahasiswa.Saat program dijalankan, pengguna memilih salah satu mode antara Terminal dan GUI.

Program ini menggabungkan materi **Control Flow** dan **Dasar Pemrograman Berorientasi Objek (OOP)**. Pengguna dapat memasukkan nama, NIM, dan nilai dari tiga mahasiswa. Setelah itu, program menampilkan kembali data yang dimasukkan serta menentukan status kelulusan berdasarkan nilai mahasiswa.

### ✨ Fitur Utama

- 📝 **Input Data Mahasiswa** — Memasukkan nama, NIM, dan nilai.
- 👥 **Pengolahan 3 Mahasiswa** — Menggunakan perulangan `for` untuk memproses data.
- 📋 **Tampilan Data** — Menampilkan informasi setiap mahasiswa dengan format yang terstruktur.
- ✅ **Pengecekan Kelulusan** — Menentukan status Lulus atau Tidak Lulus secara otomatis.
- 🧩 **Penerapan OOP** — Menggunakan class, object, attribute, dan method.

---

## 🗂️ Struktur Proyek

```text
Program-Data-Mahasiswa/
├── 📄 Mahasiswa.java   # Class Mahasiswa (attribute & method)
├── 📄 Main.java        # Menu pilihan mode + Mode Terminal
├── 📄 MainGUI.java     # Mode GUI (Swing)
└── 📄 README.md
```

**Penjelasan file:**

| File | Fungsi |
|:---|:---|
| `Mahasiswa.java` | Mendefinisikan attribute serta method untuk menyimpan dan menampilkan data mahasiswa. |
| `Main.java` | Menangani input pengguna, perulangan, pembuatan object, dan pemanggilan method. |
| `MainGUI.java` | Menyediakan antarmuka grafis (Graphical User Interface/GUI) agar pengguna dapat memasukkan dan melihat data mahasiswa melalui komponen visual, seperti kolom input, tombol, dan area hasil. |
| `README.md` | Menjelaskan deskripsi, fitur, struktur, dan cara menjalankan program. |

---

## 🏗️ Class `Mahasiswa`

Class `Mahasiswa` berfungsi sebagai cetak biru (*blueprint*) untuk membuat object mahasiswa.

### Attribute

| Attribute | Tipe Data | Keterangan |
|:---|:---|:---|
| `nama` | `String` | Menyimpan nama mahasiswa. |
| `nim` | `String` | Menyimpan Nomor Induk Mahasiswa. |
| `nilai` | `int` | Menyimpan nilai mahasiswa dalam bilangan bulat. |

### Method

| Method | Fungsi |
|:---|:---|
| `tampilkanData()` | Menampilkan nama, NIM, dan nilai mahasiswa. |
| `cekKelulusan()` | Memeriksa dan menampilkan status kelulusan mahasiswa. |

### 📊 Ketentuan Kelulusan

| Rentang Nilai | Status |
|:---:|:---|
| 60–100 | ✅ Lulus |
| 0–59 | ❌ Tidak Lulus |

> **Catatan:** Batas kelulusan adalah nilai 60. Program dasar ini mengasumsikan nilai yang dimasukkan merupakan bilangan bulat dalam rentang 0–100.

---

## ⚙️ Konsep Pemrograman yang Digunakan

| Konsep | Implementasi |
|:---|:---|
| Variable | `nama`, `nim`, `nilai`, `teks`, `i` |
| Data Type | `String`, `int` |
| Input | `Scanner` |
| Konversi Tipe Data | `Integer.parseInt()` |
| Conditional | `if / else` |
| Looping | `for` |
| Class | `Mahasiswa` |
| Object | `new Mahasiswa()` |
| Method | `tampilkanData()` dan `cekKelulusan()` |

---

## 🚀 Cara Menjalankan Program

### 1. Persiapan

Pastikan Java Development Kit (JDK) sudah terpasang di komputer.

Periksa instalasi Java melalui terminal:

```bash
java -version
javac -version
```

Jika kedua perintah menampilkan versi Java, kamu dapat melanjutkan ke tahap berikutnya.

### 2. Siapkan File

Simpan file `Mahasiswa.java` `Main.java` dan `MainGUI.java` di dalam folder yang sama.

### 3. Buka Terminal

Arahkan terminal ke folder tempat kedua file Java disimpan.

### 4. Kompilasi Program

Jalankan perintah berikut:

```bash
javac *.java
```

Perintah tersebut akan mengompilasi seluruh file Java di folder saat ini.

### 5. Jalankan Program

Setelah kompilasi berhasil, jalankan:

```bash
java Main
```

---

## 🔄 Alur Kerja Program

1. Program dimulai dan menyiapkan objek `Scanner` untuk menerima input.
2. Perulangan `for` berjalan sebanyak tiga kali.
3. Pengguna memasukkan nama, NIM, dan nilai mahasiswa.
4. Program membuat object `Mahasiswa` berdasarkan data yang dimasukkan.
5. Method `tampilkanData()` menampilkan informasi mahasiswa.
6. Method `cekKelulusan()` menentukan status kelulusan menggunakan `if / else`.
7. Program mengulangi proses sampai seluruh data mahasiswa selesai diproses.
8. Program berakhir.

---

## 📝 Catatan Penggunaan

- Jumlah mahasiswa yang diproses adalah **5 orang**.
- Nama dan NIM dibaca sebagai `String`.
- Nilai dibaca sebagai bilangan bulat menggunakan `Integer.parseInt()`.
- Nilai 60 atau lebih dinyatakan **Lulus**.
- Nilai di bawah 60 dinyatakan **Tidak Lulus**.
- Penanganan input yang tidak valid, seperti huruf pada kolom nilai, belum diterapkan dalam versi dasar ini.

---

## 🎯 Tujuan Pembelajaran

Melalui mini project ini, mahasiswa diharapkan mampu:

- Memahami penggunaan variable dan tipe data dalam Java.
- Mengimplementasikan percabangan dan perulangan.
- Memahami konsep dasar class dan object.
- Membuat serta memanggil method.
- Menggunakan `Scanner` untuk menerima input pengguna.
- Menggabungkan konsep Control Flow dan OOP dalam sebuah program sederhana.

---

<p align="center">
  <b>✨ Dibuat sebagai bagian dari pembelajaran Pemrograman Berorientasi Objek ✨</b><br>
  <i>Program Studi S1 Informatika — Universitas Syiah Kuala</i>
</p>