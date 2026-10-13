public class Mahasiswa {
   String nama;
   String nim;
   int nilai;

   public Mahasiswa() {
   }

   String tampilkanData() {
      return "Nama  : " + this.nama + "\nNIM   : " + this.nim + "\nNilai : " + this.nilai;
   }

   String cekKelulusan() {
      return this.nilai >= 60 ? "Status: Lulus" : "Status: Tidak Lulus";
   }
}