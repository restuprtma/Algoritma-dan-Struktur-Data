package Jobsheet2;

public class Buku09 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul : " +judul);
        System.out.println("Pengarang : " +pengarang);
        System.out.println("Sisa Stock : " +stok);
        System.out.println("Harga : Rp " +harga);
    }

    void terjual(int jml){
        if (stok > 0){
            stok -= jml;
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
}
