import java.util.Scanner;
public class LatihanCaseMethod1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double total = 0;
        System.out.print("Masukkan jumlah mata kuiah : ");
        int jmlMatkul = sc.nextInt();
        for (int x = 0; x < jmlMatkul; x++) {
            System.out.print("Masukkan nilai ke-" +(x+1)+ " : ");
            int nilai = sc.nextInt();
            total += nilai;
        }
        double rata2 = total/jmlMatkul;
        System.out.println("Total nilai seluruh matkul adalah : "+total);
        System.out.println("Total nilai rata-rata seluruh matkul adalah : " + rata2);
    }
}