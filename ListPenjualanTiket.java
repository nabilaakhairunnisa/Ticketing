package TiketBioskop;

//CLASS ListPenjualanTiket
public class ListPenjualanTiket {

    static VVIP list = new VVIP();

    //METHOD listPesanan
    public static void listPesanan (){
        System.out.println("______________________________________________________________________");
        System.out.println("|                    List Total Penjualan Tiket                      |");
        System.out.println("|____________________________________________________________________|");
        System.out.println("| Jenis Tiket | Banyak Tiket Terjual | Total Harga Penjualan         |");
        System.out.println("| VVIP        | "+list.jumlah+"                    |                               |");
//        System.out.println("| VIP       |    "+list.jumlah+"                 |                               |");
//        System.out.println("| Ekonomi   |    "+list.jumlah+"                 |                               |");
    }
}
