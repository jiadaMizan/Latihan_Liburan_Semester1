import java.util.Scanner;

public class LatihanPerulangan1part5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int jenis, durasi, total = 0;

        System.out.println("Masukkan jenis kendaraan");
        System.out.print("(1 Mobil, 2 Motor, 0 Keluar) : ");
        jenis = sc.nextInt();

        while (jenis != 0) {
            int totSementara = 0;
            if (jenis == 1 || jenis == 2) {

                System.out.print("Masukkan berapa lama anda parkir : ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    totSementara += 12500;
                    total += totSementara;
                    } else {
                        if (jenis == 1) {
                            totSementara += 3000;
                            total += totSementara;
                        }
                        else if (jenis == 2) {
                            totSementara += 2000;
                            total += totSementara;
                            }
                        }
                System.out.println("Harga parkir yang harus anda bayar sekarang adalah : Rp."+totSementara);
            }
            System.out.println("Masukkan jenis kendaraan");
            System.out.print("(1 Mobil, 2 Motor, 0 Keluar) : ");
            jenis = sc.nextInt();
        }
        System.out.println("Total parkir yang harus anda bayar adalah : " + total);
    }
}
