package Jobsheet2;

public class Buku09 {
    String judul, pengarang;
    int halaman, stok, harga, hargaBayar;

    void tampilInformasi(){
        System.out.println("Judul : " +judul);
        System.out.println("Pengarang : " +pengarang);
        System.out.println("Jumlah halaman : " +halaman);
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
    
    public Buku09(){

    }

    public Buku09(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public int hitungHargaTotal(int jml){
      return harga * jml;
    }

    public int hitungDiskon(int jml){
        int diskon;
        int hargaTotal = hitungHargaTotal(jml);


        if (hargaTotal > 150000){
            diskon = (int)(0.12 * hargaTotal);
        }else if (hargaTotal <= 150000 && hargaTotal >= 75000){
            diskon = (int)(0.05 * hargaTotal);
        }else {
            diskon = 0;
        }
        return diskon;
        
    }

    public int hitungHargaBayar(int jml){
        return hitungHargaTotal(jml) - hitungDiskon(jml);
    }
}
