import java.util.Scanner;
public class LatihanCaseMethodWhileKASIR {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        boolean konfirmasi=true;
        int totPilih = 0, totJmlBeli = 0, jmlPerulangan = 0;

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
            totPilih += pilih;
            System.out.print("Jumlah beli : ");
            int jmlBeli = sc.nextInt();
            totJmlBeli += jmlBeli;
            sc.nextLine();

            System.out.print("Apakah anda ingin melanjutkan pembelian? (y/n)");
            String lanjut = sc.nextLine();
            
            if (lanjut.equalsIgnoreCase("n") ) {
                konfirmasi = false;
            }
            jmlPerulangan++;
        }
    }
}