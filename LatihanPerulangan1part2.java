import java.util.Scanner;
public class LatihanPerulangan1part2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Masukkan jumlah mahasiswa yang akan dinilai : ");
        int jmlMhs = sc.nextInt();
        int x = 0;
        while (x < jmlMhs) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (x+1) + " : ");
            int nilai = sc.nextInt();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Gagal!Nilai harus berada dalam jangkauan (1-100)");
                continue;
            }
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Predikat nilai mahasiswa ke-" + (x+1) + "adalah A");
            } else if (nilai > 73) {
                System.out.println("Predikat nilai mahasiswa ke-" + (x+1) + "adalah B+");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Predikat nilai mahasiswa ke-" + (x+1) + "adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Predikat nilai mahasiswa ke-" + (x+1) + "adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Predikat nilai mahasiswa ke-" + (x+1) + "adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Predikat nilai mahasiswa ke-" + (x+1) + "adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Predikat nilai mahasiswa ke-" + (x+1) + "adalah D");
            } else if (nilai <= 39) {
                System.out.println("Predikat nilai mahasiswa ke-" + (x+1) + "adalah E");
            } 
            x++;
        }
    }
}