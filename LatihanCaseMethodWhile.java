import java.util.Scanner;
public class LatihanCaseMethodWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int total = 0, jumlah = 0;

        System.out.println("Masukkan nilai mahasiswa (ketik -1 untuk selesai");

        System.out.print("Masukkan nilai ke-" + (jumlah + 1) + " : ");
        int nilai = sc.nextInt();

        while (nilai != -1) {
            if (nilai >= 0 && nilai <= 100) {
                total += nilai;
                jumlah++;
            } else {
                System.out.println("Nilai tidak valid, masukkan nilai 0-100");
            }
            System.out.print("Masukkan nilai ke-" + (jumlah + 1) + " : ");
            nilai = sc.nextInt();
        }

        if (jumlah > 0) {
            double rata = (double) total / jumlah;
            System.out.println("Jumlah nilai : " + (jumlah));
            System.out.println("Total nilai : " + (total));
            System.out.println("Total nilai : " + (total));
        }

        sc.close();
    }
}