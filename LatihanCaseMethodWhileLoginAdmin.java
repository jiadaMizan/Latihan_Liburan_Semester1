import java.util.Scanner;
public class LatihanCaseMethodWhileLoginAdmin {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String usernameBenar = "TokaiTeio", passwordBenar = "3Crowned";
        int kesempatan = 3;
        boolean loginBerhasil = false;

        while (kesempatan > 0 && !loginBerhasil) {
            System.out.print("Masukkan username : ");
            String inputUsername = sc.nextLine();

            System.out.print("Masukkan password : ");
            String inputPassword = sc.nextLine();

            if (inputUsername == usernameBenar && inputPassword == passwordBenar) {
                System.out.println("Login telah berhasil");
                break;
            } else if (inputUsername == usernameBenar || inputPassword == passwordBenar) {
                kesempatan --;
                System.out.println("Cek kembali username atau password");
                System.out.println("Peringatan! Percobaan tersisa " + kesempatan);
                System.out.println();
            } else {
                kesempatan--;
                System.out.println("Username dan password salah!");
                System.out.println("Peringatan! Percobaan tersisa " + kesempatan);
                System.out.println();
            }

            if (kesempatan <= 1 && !loginBerhasil) {
                System.out.println("Akun terkunci, silahkan menghubungi kantor pusat untuk membuka");
                System.out.println();
                break;
            }
        }
        sc.close();
    }
}