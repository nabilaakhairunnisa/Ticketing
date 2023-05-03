package TiketBioskop;
import java.util.Scanner;

public class MenuPesanTiket {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in); //membuat objek input dari kelas Scanner
        VVIP vvip = new VVIP(); //membuat objek vvip dari kelas VVIP
        VIP vip = new VIP(); //membuat objek vip dari kelas VIP
        Ekonomi eko = new Ekonomi(); //membuat objek eko dari kelas Ekonomi

        int pilihan;
        char ulang;

        do {
            System.out.println("====================================");
            System.out.println("|  Menu Pesan Tiket Bioskop XII    |");
            System.out.println("| 1. VVIP    :          45.000.-   |");
            System.out.println("| 2. VIP     :          40.000.-   |");
            System.out.println("| 3. Ekonomi :          35.000.-   |");
            System.out.println("| 4. Keluar                        |");
            System.out.println("====================================");
            System.out.println("Masukkan Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    vvip.VVIP(); //memanggil method VVIP menggunakan objek vvip dari kelas VVIP
                    break;
                case 2:
                    vip.VIP();
                    break;
                case 3:
                    eko.Ekonomi();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    break;
            }

            System.out.println("Apakah anda ingin memesan tiket lagi? (y/t): ");
            ulang = input.next().charAt(0);

        }while (ulang == 'y');
    }
}




