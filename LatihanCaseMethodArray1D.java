import java.util.Scanner;
public class LatihanCaseMethodArray1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
         int jmlNilai = sc.nextInt();

         int [] dataNilai = new int [jmlNilai];

         for (int x = 0; x < jmlNilai ; x++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (x+1) + " : ");
            dataNilai[x] = sc.nextInt();
         }
    }
}