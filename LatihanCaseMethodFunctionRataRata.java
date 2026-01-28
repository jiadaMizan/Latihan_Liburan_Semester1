import java.util.Scanner;
public class LatihanCaseMethodFunctionRataRata {
    static Scanner sc = new Scanner (System.in);

    static double rata2 (int[]dataNilai) {
        int total =  0;
        
        for (int x = 0; x < dataNilai.length ; x++){
            total += dataNilai[x];
        }
        return (double) total / dataNilai.length;
    }

    static String status (double rata2) {
        if (rata2 >= 75) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jmlMatkul = sc.nextInt();
        System.out.println();
        int[] dataNilai = new int[jmlMatkul];
        for (int x = 0; x < jmlMatkul; x++) {
            System.out.print("Masukkan nilai ke-" + (x+1) + " : ");
            dataNilai[x] = sc.nextInt();
        }
        System.out.println();
        double nilaiRataRata = rata2(dataNilai);
        System.out.println("Nilai rata-rata mahasiswa adalah : " + nilaiRataRata);
        System.out.println("Status mahasiswa : " + status(nilaiRataRata));
    }
}