package TiketBioskop;

import java.util.Scanner;
import java.util.Stack;

public class VVIP {

    static Scanner input = new Scanner (System.in);
    static Stack<Integer> banyakTiket = new Stack<Integer>();
    static Stack<Integer> hargaTiket = new Stack<Integer>();

    public static int tiket;


    //METHOD pesanVVIP
    public static void pesanVVIP(){
        System.out.println("______________________________________________________________________");
        System.out.println("|                      Menu Pesan Tiket VVIP                         |");
        System.out.println("|____________________________________________________________________|");
        System.out.print  ("| Masukkan banyak tiket yang ingin dipesan: ");
        tiket = input.nextInt();
        banyakTiket.push(tiket);
        totalTiket();
        System.out.println(jumlah);
        System.out.println("| Total harga yang harus dibayar adalah: " + getTiket());
        System.out.println("|____________________________________________________________________|");
        System.out.println("|                  Terima Kasih Telah Memesan!                       |");
        System.out.println("|                     Selamat Menyaksikan :)                         |");
    }

    public static int jumlah;
    public static void totalTiket(){
        while (!banyakTiket.isEmpty()){
            int elemen = banyakTiket.pop();
            jumlah += elemen;
        }
    }

    public static int getTiket() {
        int harga = 45000;
        return (tiket * harga);
    }
}
