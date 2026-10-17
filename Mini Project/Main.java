import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("=== Mahasiswa ke-" + i + " ===");

            Mahasiswa mhs = new Mahasiswa();

            System.out.print("Nama  : ");
            mhs.nama = input.nextLine();

            System.out.print("NIM   : ");
            mhs.nim = input.nextLine();

            System.out.print("Nilai : ");
            String teks = input.nextLine();
            mhs.nilai = Integer.parseInt(teks);

            System.out.println("--- Hasil ---");
            mhs.tampilkanData();
            mhs.cekKelulusan();
            System.out.println();
        }
    }
}