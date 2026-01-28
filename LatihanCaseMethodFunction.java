import java.util.Scanner;
public class LatihanCaseMethodFunction {
    static Scanner sc = new Scanner (System.in);

    static int hitungLuasPersegiPanjang (int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan nilai panjang : ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan nilai Lebar : ");
        int lebar = sc.nextInt();
        
        System.out.println("Luas dari persegi panjang adalah : " + (hitungLuasPersegiPanjang(panjang, lebar)));
    }

}