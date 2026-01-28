import java.util.Scanner;
public class LatihanCaseMethodFunctionVoid {
    static Scanner sc = new Scanner (System.in);

    static String kelulusanMahasiswa (int nilai) {
        if (nilai >= 75) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    public static void main(String[] args) {

        int konfir = 1;

        while (konfir == 1) {
            System.out.print("Masukkan nilai akhir mahasiswa : ");
            int nilai = sc.nextInt();
            kelulusanMahasiswa(nilai);
            System.out.println("Status kelulusan mahasiswa : " +kelulusanMahasiswa(nilai));
            System.out.println();
            System.out.print("Ketik '1' untuk lanjut dan '0' untuk berhenti : ");
            konfir = sc.nextInt();
        }
    }
}