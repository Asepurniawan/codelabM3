Tentu, ini adalah contoh file **README.md** yang sesuai untuk kode program Java penghitung luas persegi panjang tersebut.

# 📐 Program Penghitung Luas Persegi Panjang

## Deskripsi

Program sederhana ini ditulis dalam bahasa **Java** dan berfungsi untuk menghitung **luas persegi panjang** berdasarkan input panjang dan lebar yang dimasukkan oleh pengguna. Program ini menggunakan kelas `Scanner` untuk memfasilitasi interaksi pengguna melalui konsol.

## 🚀 Cara Menjalankan

### Persyaratan

Pastikan Anda sudah menginstal **Java Development Kit (JDK)** di sistem Anda.

### 1\. Kompilasi (Compile)

Buka terminal atau Command Prompt, arahkan ke direktori tempat Anda menyimpan file `LuasPersegiPanjang.java`, kemudian kompilasi kode:

```bash
javac LuasPersegiPanjang.java
```

### 2\. Eksekusi (Run)

Setelah berhasil dikompilasi, jalankan program menggunakan perintah berikut:

```bash
java LuasPersegiPanjang
```

### 3\. Interaksi

Program akan meminta Anda memasukkan nilai panjang dan lebar. Masukkan angka (boleh menggunakan desimal) dan tekan `Enter` setelah setiap input.

## 📝 Kode Sumber (`LuasPersegiPanjang.java`)

```java
import java.util.Scanner;

public class LuasPersegiPanjang {

    public static void main(String[] args) {
        // Mendeklarasikan variabel untuk panjang, lebar, dan luas
        double panjang;
        double lebar;
        double luas;

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        System.out.println("--- Program Menghitung Luas Persegi Panjang ---");

        // Meminta pengguna memasukkan panjang
        System.out.print("Masukkan nilai panjang: ");
        panjang = input.nextDouble();

        // Meminta pengguna memasukkan lebar
        System.out.print("Masukkan nilai lebar: ");
        lebar = input.nextDouble();

        // Menghitung luas persegi panjang (Rumus: Luas = Panjang * Lebar)
        luas = panjang * lebar;

        // Menampilkan hasil perhitungan
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas Persegi Panjang adalah: " + luas);
        
        // Menutup objek Scanner
        input.close();
    }
}
```

## 💡 Rumus yang Digunakan

Perhitungan luas persegi panjang menggunakan rumus dasar:

$$
\text{Luas} = \text{Panjang} \times \text{Lebar}
$$## 🤝 Kontribusi

Jika Anda menemukan *bug* atau memiliki saran perbaikan, silakan buat *pull request* atau buka *issue* di repositori ini.
$$