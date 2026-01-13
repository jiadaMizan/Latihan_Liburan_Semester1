import java.util.Scanner;
public class LatihanCaseMethodArray1DSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah barang : ");
        int jmlBarang = sc.nextInt();
        boolean ditemukan = false;

        int [] dataBarang = new int [jmlBarang];

        for (int x = 0; x < jmlBarang; x++) {
            System.out.print("Masukkan kode barang ke-" + (x+1) + " : ");
            dataBarang[x] = sc.nextInt();
        }

        System.out.print("Masukkan kode barang yang ingin dicari : ");
        int cari = sc.nextInt();

        for (int x = 0; x < jmlBarang; x++) {
            if (cari == dataBarang[x]) {
                System.out.println("Kode barang " + (cari) + " ditemukan pada baris barang ke-" + (x+1));
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode barang " + (cari) + " tidak ditemukan");
        }
 
        sc.close();
    }
}