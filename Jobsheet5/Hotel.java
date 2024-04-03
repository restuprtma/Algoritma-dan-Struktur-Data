package Jobsheet5;

public class Hotel {
    String nama;
    String kota;
    int harga;
    Byte bintang;

    Hotel(String nama, String kota, int harga, Byte bintang){
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }
    void tampil(){
        System.out.println("Nama Hotel: " + nama);
        System.out.println("Kota: " + kota);
        System.out.println("Harga: " + harga);
        System.out.println("Rating: " + bintang);
    }
}
