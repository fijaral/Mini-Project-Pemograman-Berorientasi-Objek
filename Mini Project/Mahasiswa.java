public class Mahasiswa {
    String nama;
    String nim;
    int nilai;

    String tampilkanData() {
        return "Nama  : " + nama + "\n"
             + "NIM   : " + nim + "\n"
             + "Nilai : " + nilai;
    }

    String cekKelulusan() {
        if (nilai >= 60) {
            return "Status: Lulus";
        } else {
            return "Status: Tidak Lulus";
        }
    }
}