package UTS;

public class Barang {
    private String kodeBarang;
    private String nama;
    private String kategori;
    private int hargaSatuan;
    private int stok;

    public Barang(String kodeBarang, String nama, String kategori, int hargaSatuan, int stok) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.hargaSatuan = hargaSatuan;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getStok() {
        return stok;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    @Override
    public String toString() {
        return String.format("| %-12s | %-15s | %-10s | %-13d | %-4d |", kodeBarang, nama, kategori, hargaSatuan, stok);
    }
}
