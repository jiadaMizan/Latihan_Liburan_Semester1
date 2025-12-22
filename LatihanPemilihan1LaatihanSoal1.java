import java.util.Scanner;
public class LatihanPemilihan1LaatihanSoal1 {
    static Scanner sc = new Scanner (System.in);

    public static String cekGanjilGenap () {
        System.out.println("Masukkan angka : ");
        int angka = sc.nextInt();
        if (angka %2 == 0) {
            System.out.println("Angka yang kamu masukkan adalah angka genap");
        } else {
            System.out.println("Angka yang kamu masukkan adalah angka ganjil");
        }
        return "";
    }
    
    public static int hitungLuasPersegi (int x, int y) {
        System.out.print("Masukkan panjang persegi : ");
        x = sc.nextInt();
        System.out.print("Masukkan lebar persegi : ");
        y = sc.nextInt();
        int luasPersegi = x * y; 
        System.out.println("Luas persegi adalah : " + luasPersegi);
        return luasPersegi;
    }

    public static void main(String[] args) {
        cekGanjilGenap();
        hitungLuasPersegi(0, 0);
    }
}