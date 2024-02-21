package Jobsheet2;

public class BukuMain09 {

    public static void main(String[] args) {
        Buku09 bk1 = new Buku09();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        System.out.println("========================");
        Buku09 bk2 = new Buku09("Self Reward", "Maheer Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        System.out.println("Harga Total : Rp " + bk2.hitungHargaTotal(11));
        System.out.println("Diskon : Rp " + bk2.hitungDiskon(11));
        System.out.println("Harga bayar : Rp " + bk2.hitungHargaBayar(11));

        System.out.println("========================");
        Buku09 buku09 = new Buku09("Tips sukses secara kebetulan", "Komeng", 2, 200, 79000);
        buku09.terjual(16);
        buku09.tampilInformasi();
       

    }
}
