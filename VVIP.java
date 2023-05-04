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
        tiket = input.nextInt();     //menerima input nilai
        banyakTiket.push(tiket);     //menyimpan nilai tiket ke dalam stack banyakTiket
        totalTiket();                //memanggil method totalTiket untuk dijumlahkan
        System.out.println("| Total harga yang harus dibayar adalah: " + getTiket());
        hargaTiket.push(getTiket()); //menyimpan nilai yang dihasilkan dari method getTiket ke dalam stack hargaTiket
        totalHarga();               //memanggil method totalHarga untuk dijumlahkan
        System.out.println("|____________________________________________________________________|");
        System.out.println("|                  Terima Kasih Telah Memesan!                       |");
        System.out.println("|                     Selamat Menyaksikan :)                         |");
    }

    public static int banyak;
    public static void totalTiket(){
        while (!banyakTiket.isEmpty()){
            int elemen = banyakTiket.pop();
            banyak += elemen;
        }
    }

    public static int getTiket() {
        int harga = 45000;
        return (tiket * harga);
    }

    //method totalHarga
    public static int harga;
    public static void totalHarga(){
        while(!hargaTiket.isEmpty()){
            int elemen = hargaTiket.pop();
            harga += elemen;
        }
    }
}
