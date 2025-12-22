import java.util.Scanner;
public class LatihanPerulangan1part3 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {

        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        
        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            String namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase ("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi : ");
            int kopi = sc.nextInt();
            System.out.print("Jumlah teh : ");
            int teh = sc.nextInt();
            System.out.print("Jumlah roti : ");
            int roti = sc.nextInt();

            int totHarga =  (kopi*hargaKopi) + (teh*hargaTeh) + (roti * hargaRoti);

            System.out.println("Total yang harus dibayar : Rp." +totHarga); 
            sc.nextLine();

        } while (true);

    }
}