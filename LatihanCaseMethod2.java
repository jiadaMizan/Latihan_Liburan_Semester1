import java.util.Scanner;
    public class LatihanCaseMethod2 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            int jmlMhs = 0, nilaiTotal=0, tertinggi = 0, terendah = 100;
            System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput : ");
            jmlMhs = sc.nextInt();

            int [] nilaiMhs = new int [jmlMhs];
   
            for (int x = 0; x < jmlMhs; x++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (x+1) + " : ");
                nilaiMhs[x] = sc.nextInt();
                nilaiTotal += nilaiMhs[x];
            }

            for (int x = 0; x < jmlMhs; x++) {
                if (nilaiMhs[x] < terendah) {
                    terendah = nilaiMhs[x];
                } else if (nilaiMhs[x] > tertinggi) {
                    tertinggi = nilaiMhs[x];
                }
            }

            double rataNilai = nilaiTotal/jmlMhs;

            System.out.println("Nilai total seluruh mahasiswa adalah : " +nilaiTotal);
            System.out.println("Nilai rata-rata mahasiswa adalah : " +rataNilai);
            System.out.println("Nilai mahasiswa tertinggi adalah : " +tertinggi);
            System.out.println("Nilai mahasiswa terendah adalah : " +terendah);
            sc.close();
        }
    }