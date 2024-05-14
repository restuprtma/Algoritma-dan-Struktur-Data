package Jobsheet7;

public class Gudang09 {
    Barang09[] tumpukan;
    int size;
    int top;

    Gudang09(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang09[size];
        top = 1;
    }
    boolean cekKosong(){
        if(top == -1){
            return true;
        } else {
            return false;
        }
    }
    boolean cekPenuh(){
        if(top == size -1){
            return true;
        } else {
            return false;
        }
    }
    public void tambahBarang(Barang09 brg){
        if(!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang digudang sudah penuh");
        }
    }
    public Barang09 ambilBarang(){
        if (!cekKosong()) {
            Barang09 delete = tumpukan[top];
            top--;
            System.out.println("Baranf " + delete.nama + " diambil dari gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    public Barang09 lihatBarangTeratas(){
        if(!cekKosong()){
            Barang09 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    public void tampilkanBarang(){
        if(!cekKosong()){
            System.out.println("Rincian tumpukan barang di gudang: ");
            for (int i=0;i<=top;i++){
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
                System.out.println("Tumpukan barang kosong");
        }
    }
    public String KonversiDesimalKeBiner(int kode){
        StackKonversi09 stack = new StackKonversi09();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang09 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang09 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }
    
    public Barang09 cariBarang(int kode, String nama) {
        if (!cekKosong()) {
            for (int i = top; i >= 0; i--) {
                if (tumpukan[i].kode == kode || tumpukan[i].nama.equals(nama)) {
                    System.out.println("Barang ditemukan: " + tumpukan[i].nama);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang tidak ditemukan.");
            return null;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }
}
