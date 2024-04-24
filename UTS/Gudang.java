package UTS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Gudang {
    private ArrayList<Barang> listBarang;

    public Gudang() {
        listBarang = new ArrayList<>();
    }

    public void tambahDataBarang(Barang barang) {
        listBarang.add(barang);
    }

    public void tampilkanDataBarang() {
        System.out.println("\nData Barang:");
        System.out.println("| Kode Barang  | Nama            | Kategori   | Harga Satuan  | Stok |");
        System.out.println("======================================================================");
        for (Barang barang : listBarang) {
            System.out.println(barang);
        }
    }

    public void urutkanDataBarang() {
        Collections.sort(listBarang, Comparator.comparingInt(Barang::getStok));
        tampilkanDataBarang();
    }

    public void tampilkanMakananTanpaStok() {
        System.out.println("\nMakanan tanpa stok:");
        System.out.println("| Kode Barang  | Nama            | Kategori   | Harga Satuan  | Stok |");
        System.out.println("======================================================================");
        for (Barang barang : listBarang) {
            if (barang.getKategori().equalsIgnoreCase("Food") && barang.getStok() == 0) {
                System.out.println(barang);
            }
        }
    }

    public ArrayList<Barang> cariBarang(String kataKunci) {
        ArrayList<Barang> hasilPencarian = new ArrayList<>();
        for (Barang barang : listBarang) {
            if (barang.getNama().toLowerCase().contains(kataKunci.toLowerCase())) {
                hasilPencarian.add(barang);
            }
        }
        return hasilPencarian;
    }

    public void tambahStok(String kodeBarang, int jumlah) {
        for (Barang barang : listBarang) {
            if (barang.getKodeBarang().equals(kodeBarang)) {
                barang.tambahStok(jumlah);
                System.out.println("Stok berhasil ditambahkan.");
                return;
            }
        }
        System.out.println("Kode barang tidak ditemukan.");
    }

    public void kurangiStok(String kodeBarang, int jumlah) {
        for (Barang barang : listBarang) {
            if (barang.getKodeBarang().equals(kodeBarang)) {
                barang.kurangiStok(jumlah);
                return;
            }
        }
        System.out.println("Kode barang tidak ditemukan.");
    }
}
    