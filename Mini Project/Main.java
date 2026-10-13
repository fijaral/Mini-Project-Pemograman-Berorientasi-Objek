import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("===== PROGRAM DATA MAHASISWA =====");
            System.out.println("1. Mode Terminal");
            System.out.println("2. Mode GUI");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            String teks = input.nextLine();
            pilihan = Integer.parseInt(teks);

            if (pilihan < 1 || pilihan > 3) {
                System.out.println("Pilihan salah, coba lagi.\n");
            }
        } while (pilihan < 1 || pilihan > 3);

        switch (pilihan) {
            case 1:
                modeTerminal(input);
                break;
            case 2:
                MainGUI.jalankan();
                break;
            default:
                System.out.println("Program selesai.");
        }
    }

    // Mode Terminal
    static void modeTerminal(Scanner input) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n=== Mahasiswa ke-" + i + " ===");

            Mahasiswa mhs = new Mahasiswa();

            System.out.print("Nama  : ");
            mhs.nama = input.nextLine();

            System.out.print("NIM   : ");
            mhs.nim = input.nextLine();

            System.out.print("Nilai : ");
            String teks = input.nextLine();
            mhs.nilai = Integer.parseInt(teks);

            System.out.println("--- Hasil ---");
            System.out.println(mhs.tampilkanData());
            System.out.println(mhs.cekKelulusan());
        }
    }
}
