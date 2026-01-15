import java.util.Scanner;
public class LatihanCaseMethodWhileKASIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        boolean konfirmasi=true;
        int totPilih = 0, totJmlBeli = 0, jmlPerulangan = 0, harga, totHarga = 0, totKeseluruhan = 0;

        System.out.println("=== TOKO MADURA SUNDA PAK ASEP ===");
        System.out.println();

        while (konfirmasi) {
            System.out.println("Daftar barang : ");
            System.out.println("1. Buku tulis : 5000");
            System.out.println("2. Pulpen     : 3000");
            System.out.println("3. Penghapus  : 2000");
            System.out.println("4. Penggaris  : 4000");
            System.out.print("Pilih kode nomor barang (1-4) : ");
            int pilih = sc.nextInt();
            if (pilih > 4) {
                System.out.println("Kode nomor barang tidak valid, masukkan (1-4)!");
                System.out.println();
                continue;
            }
            totPilih += pilih;
            System.out.print("Jumlah beli : ");
            int jmlBeli = sc.nextInt();
            totJmlBeli += jmlBeli;
            sc.nextLine();
            System.out.println();

            if (pilih == 1) {
                harga = 5000;
                totHarga = harga * jmlBeli;
            } else if (pilih == 2) {
                harga = 3000;
                totHarga = harga * jmlBeli;
            } else if (pilih == 3) {
                harga = 2000;
                totHarga = harga * jmlBeli;
            } else if (pilih == 4) {
                harga = 4000;
                totHarga = harga * jmlBeli;
            }
            totKeseluruhan += totHarga;

            System.out.print("Apakah anda ingin melanjutkan pembelian? (y/n)");
            String lanjut = sc.nextLine();
            System.out.println();

            if (lanjut.equalsIgnoreCase("n") ) {
                konfirmasi = false;
            }
        }

        System.out.println("--- Total Belanjaan Anda---");
        System.out.println("Total harga yang harus dibayar : Rp." + (totKeseluruhan));
        System.out.println("");
    }
}