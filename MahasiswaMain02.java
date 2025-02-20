import java.util.Scanner;

public class MahasiswaMain02 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nama;
    String nim;
    String kelas;
    Double ipk;

    Mahasiswa02 mhs1 = new Mahasiswa02();
    mhs1.nama = "muhamad Ali Farhan";
    mhs1.nim = "2241720171";
    mhs1.kelas = "SI 2J";
    mhs1.ipk = 3.55;

    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("SI 2K");
    mhs1.updateIpk(3.60);
    mhs1.tampilkanInformasi();
   }

}
