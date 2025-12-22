import java.util.Scanner;
public class LatihanPemilihan1 {
    static Scanner sc = new Scanner (System.in);
    public static boolean cekUKT () {
        System.out.println("--- CETAK KRS ---");
        System.out.println("Apakah UKT sudah lunas ? (true/false) : ");
        boolean lunas = sc.nextBoolean();
    
        if (lunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Pembayaran UKT belum memenuhi syarat");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }
        return lunas;
    }

    public static void cekSemester () {
        System.out.println("Masukkan semester saat ini : ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS semester 1 ditampilkan ");
            } else if (semester == 2) {
                System.out.println("KRS semester 2 ditampilkan ");
            } else if (semester == 3) {
                System.out.println("KRS semester 3 ditampilkan ");
            } else if (semester == 4) {
                System.out.println("KRS semester 4 ditampilkan ");
            } else if (semester == 5) {
                System.out.println("KRS semester 5 ditampilkan ");
            } else if (semester == 6) {
                System.out.println("KRS semester 6 ditampilkan ");
            } else if (semester == 7) {
                System.out.println("KRS semester 7 ditampilkan ");
            } else if (semester == 8) {
                System.out.println("KRS semester 8 ditampilkan ");
            }  else {
                System.out.println("Semester harus dalam jangkauan 1-8 ");
            }
        }

    public static void cekKompen () {
        int p1 = 0;
        int p2 = 0;
        System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak) : ");
        String konfirmasi = sc.nextLine();
        if (konfirmasi.equalsIgnoreCase("ya")) {
            System.out.println("Masukkan jumlah log bimbingan pembimbing 1: ");
            p1 = sc.nextInt();
            System.out.println("Masukkan jumlah log bimbingan pembimbing 2: ");
            p2 = sc.nextInt();
            if (p1>=8 && p2>=4) {
                System.out.println("Semua syarat terpenuhi, mahasiswa boleh mendaftar ujian skripsi");
                } else if (p1 < 8 && p2 <4) {
                    System.out.println("Gagal, bimbingan 1 kurang dari 8 dan bimbingan 2 kurang dari 4");
                } else if (p1 < 8) {
                    System.out.println("Gagal, bimbingan 1 kurang dari 8");
                } else {
                    System.out.println("Gagal! mahasiswa tidak memiliki gangguan kompen");
                }
            } else {
            System.out.println("Gagal, mahasiswa masih memiliki tanggungan");
        }
    }

    public static void main(String[] args) {
        if (cekUKT() == true) {
            cekSemester();
            cekKompen();
        }
        sc.close();
    }
}