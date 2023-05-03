package TiketBioskop;
import java.util.Scanner;
public class VVIP {
    public void VVIP() {
        Scanner input = new Scanner(System.in);

        int jumlahTiket;
        int totalHarga;

        System.out.println("===============================================");
        System.out.println("           Menu Ticketing Bioskop VVIP         ");
        System.out.println("Masukkan jumlah tiket:                         ");
        jumlahTiket = input.nextInt();
        totalHarga = jumlahTiket * 45000;
        System.out.println("Total Harga:                                  ");
        System.out.println(totalHarga);
        System.out.println("Terima kasih sudah membeli tiket di Cinema XXI");
        System.out.println("Selamat Menyaksikan :)                        ");
        System.out.println("===============================================");
    }
}
