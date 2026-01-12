import java.util.Scanner;
public class LatihanCaseMethodArray1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
         int jmlNilai = sc.nextInt();

         int [] dataNilai = new int [jmlNilai];
        int ketemu = 0;
         for (int x = 0; x < jmlNilai ; x++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (x+1) + " : ");
            dataNilai[x] = sc.nextInt();
         }
         
         System.out.println("Masukkan nilai yang ingin di cari");
         System.out.println("(nilai yang harus dicari adalah nilai yang sudah diinput diatas) : ");
         int cari = sc.nextInt();

        for (int x = 0; x < jmlNilai; x++) {
            if (cari == dataNilai[x]) {
                ketemu = x;
                System.out.println("Nilai " +(cari)+ " ketemu di array ke-" + (ketemu+1));
                break;
            }
        }
        if (ketemu == 0 && cari != dataNilai[0]) {
            System.out.println("Nilai " + (cari) + (" tidak ditemukan di array manapun"));
        }
         sc.close();
    }
}