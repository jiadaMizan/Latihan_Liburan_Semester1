import java.util.Scanner;
public class LatihanCaseMethodWhileDisplayAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan angka N : ");
        int N = sc.nextInt();

        for (int x = 0; x < N; x++) {
            System.out.println(x+1);
        }
        
     sc.close();   
    }
}