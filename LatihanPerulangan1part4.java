import java.util.Scanner;
public class LatihanPerulangan1part4 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {

        int hargaTiket = 50000, totJmlTiket = 0, totHargaTiket = 0;
        double totHarga=0;
        System.out.println("=====TIKET YANG TERJUAL HARI INI=====");

        do {
            System.out.print("Masukkan jumlah tiket yang akan anda beli : ");
            int jmlTiket = sc.nextInt();
            if (jmlTiket > 10) {
                totHarga = jmlTiket * (hargaTiket * 0.15);
                System.out.println("Selamat anda mendapatkan diskon 15%"); 
                System.out.println("Total harga yang harus anda bayar adalah : Rp." +totHarga);
            } else if (jmlTiket > 4) {
                totHarga = jmlTiket * (hargaTiket * 0.1);
                System.out.println("Selamat anda mendapatkan diskon 10%");
                System.out.println("Total harga yang harus anda bayar adalah : Rp." +totHarga);
            } else if (jmlTiket <= 4) {
                totHarga = jmlTiket * hargaTiket;
                System.out.println("Total harga yang harus anda bayar adalah : Rp." +totHarga);
            } else if (jmlTiket <= 0) {
                System.out.println("Pembelian tiket tidak boleh negatif, silahkan memasukkan jumlah tiket yang ingin dibeli!");
                continue;
            }
            totJmlTiket += jmlTiket;
            totHargaTiket += totHarga;
            sc.nextLine();

            while (true) {
            System.out.println("Apakah anda ingin membeli tiket lagi? (ya/tidak)");
            String konfirmasi = sc.nextLine();

            if (konfirmasi.equalsIgnoreCase("ya")) {
                break;
                } else if (konfirmasi.equalsIgnoreCase("tidak")) {
                    System.out.println("=====HASIL PEMBELIAN HARI INI=====");
                    System.out.println("Total tiket yang dibeli sebanyak : " + totJmlTiket);
                    System.out.println("Total harga pembelian tiket sebanyak : " + totHargaTiket);
                    System.out.println();
                    System.out.println("Terimakasih telah menggunakan layanan kami");
                    return;
                } else {
                    System.out.println("ERROR!!! Mohon memasukkan (Ya/Tidak)");
                }
            }
        } while (true);
        
    }
}