import java.util.Scanner;

public class LatihanCaseMethodArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();

        String[] namaMhs = new String[jmlMhs];
        int[][] dataMhs = new int[jmlMhs][jmlMatkul];

        for (int x = 0; x < jmlMhs; x++) {
            System.out.print("Nama mahasiswa ke-" + (x + 1) + " : ");
            namaMhs[x] = sc.nextLine();

            for (int y = 0; y < jmlMatkul; y++) {
                System.out.print("Masukkan nilai matkul ke-" + (y + 1) + " : ");
                dataMhs[x][y] = sc.nextInt();
            }
            sc.nextLine(); 
        }

        System.out.println("\n=== DATA NILAI MAHASISWA ===");
        for (int x = 0; x < jmlMhs; x++) {
            System.out.println("Nama Mahasiswa : " + namaMhs[x]);
            for (int y = 0; y < dataMhs[x].length; y++) {
                System.out.println("Nilai matkul ke-" + (y + 1) + " : " + dataMhs[x][y]);
            }
            System.out.println();
        }
        sc.close();
    }
}
