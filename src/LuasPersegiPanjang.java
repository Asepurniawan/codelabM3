import java.util.Scanner;

class LuasPersegiPanjang {

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
        panjang = input.nextDouble(); // Menerima input panjang

        // Meminta pengguna memasukkan lebar
        System.out.print("Masukkan nilai lebar: ");
        lebar = input.nextDouble(); // Menerima input lebar

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