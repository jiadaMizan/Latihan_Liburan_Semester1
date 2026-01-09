import java.util.Scanner;
public class LatihanCaseMethodArray1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hargaTotal = 0;

        System.out.print("Masukkan jumlah pesanan : ");
        int jmlPesanan = sc.nextInt();
        System.out.println();
        sc.nextLine();

        String [] namaPesanan = new String [jmlPesanan];
        int [] hargaPesanan = new int [jmlPesanan];

        for (int x = 0 ; x < jmlPesanan ; x++) {
            System.out.println("Pesanan ke-" + (x+1));
            System.out.print("Masukkan nama makanan ke-" + (x+1) + " : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan harga " + (nama) + " : ");
            int harga = sc.nextInt();
            System.out.println();
            sc.nextLine();
            namaPesanan[x] = nama;
            hargaPesanan[x] = harga;
            hargaTotal += harga;
        }

        System.out.println("=====DAFTAR PESANAN=====");
        for (int x = 0 ; x < jmlPesanan ; x++) {
            System.out.println((x+1) + ". " + (namaPesanan[x]) + " - Rp " + (hargaPesanan[x]));
        }

        System.out.println("====================================");
        System.out.println("Total biaya : Rp " + (hargaTotal));

        sc.close();
    }
}