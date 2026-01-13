import java.util.Scanner;
public class LatihanCaseMethodArray1DSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah barang : ");
        int jmlBarang = sc.nextInt();

        int [] dataBarang = new int [jmlBarang];

        for (int x = 0; x < jmlBarang; x++) {
            System.out.println("Masukkan kode barang ke-" + (x+1) + " : ");
            dataBarang[x] = sc.nextInt();
        }

        sc.close();
    }
}