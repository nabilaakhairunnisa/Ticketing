package TiketBioskop;

//CLASS ListPenjualanTiket
public class ListPenjualanTiket {

    static VVIP list = new VVIP();
    static VIP list1 = new VIP();
    static Ekonomi list2 = new Ekonomi();

    //METHOD listPesanan
    public static void listPesanan (){
        System.out.println("______________________________________________________________________");
        System.out.println("|                    List Total Penjualan Tiket                      |");
        System.out.println("|____________________________________________________________________|");
        System.out.println("| Jenis Tiket | Banyak Tiket Terjual | Total Harga Penjualan         |");
        System.out.println("| VVIP        | "+list.banyak+"                    | "+list.harga+"   ");
        System.out.println("| VIP         | "+list1.banyak+"                    | "+list1.harga+"   ");
        System.out.println("| Ekonomi     | "+list2.banyak+"                    | "+list2.harga+"   ");
    }
}
