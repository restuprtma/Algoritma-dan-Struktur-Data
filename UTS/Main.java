package UTS;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gudang gudang = new Gudang();
        
        tambahDataBarangAwal(gudang);

        boolean selesai = false;
        while (!selesai) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahDataBarang(scanner, gudang);
                    break;
                case 2:
                    gudang.tampilkanDataBarang();
                    break;
                case 3:
                    gudang.urutkanDataBarang();
                    break;
                case 4:
                    gudang.tampilkanMakananTanpaStok();
                    break;
                case 5:
                    cariBarang(scanner, gudang);
                    break;
                case 6:
                    tambahStok(scanner, gudang);
                    break;
                case 7:
                    kurangiStok(scanner, gudang);
                    break;
                case 0:
                    selesai = true;
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }

    static void tambahDataBarangAwal(Gudang gudang) {
        gudang.tambahDataBarang(new Barang("16030927", "Indomilk", "Drink", 15000, 100));
        gudang.tambahDataBarang(new Barang("16100617", "Sprite", "Drink", 7000, 70));
        gudang.tambahDataBarang(new Barang("16240401", "Yakult", "Drink", 9000, 500));
        gudang.tambahDataBarang(new Barang("16270525", "Indomie", "Food", 3500, 250));
        gudang.tambahDataBarang(new Barang("16971204", "Oreo", "Food", 12000, 320));
        gudang.tambahDataBarang(new Barang("16100727", "Chocochips", "Food", 4000, 120));
        gudang.tambahDataBarang(new Barang("16460329", "Ballpoint", "Stationary", 2000, 75));
        gudang.tambahDataBarang(new Barang("16320421", "Pencil", "Stationary", 2000, 110));
        gudang.tambahDataBarang(new Barang("16180729", "Book", "Stationary", 4500, 57));
    }

    static void tambahDataBarang(Scanner scanner, Gudang gudang) {
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kategori barang: ");
        String kategori = scanner.nextLine();
        System.out.print("Masukkan harga satuan barang: ");
        int hargaSatuan = scanner.nextInt();
        System.out.print("Masukkan stok barang: ");
        int stok = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline character
        
        Barang barang = new Barang(kodeBarang, nama, kategori, hargaSatuan, stok);
        gudang.tambahDataBarang(barang);
        System.out.println("Data barang berhasil ditambahkan.");
    }

    static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Masukkan/tambahkan data barang");
        System.out.println("2. Tampilkan semua data barang");
        System.out.println("3. Urutkan data barang berdasarkan nilai stok dalam mode menaik");
        System.out.println("4. Menampilkan data Barang yang tergolong makanan yang tidak memiliki stok");
        System.out.println("5. Cari data barang berdasarkan kata kunci nama");
        System.out.println("6. Tambahkan stok untuk barang tertentu");
        System.out.println("7. Kurangi stok untuk barang tertentu");
        System.out.println("0. Keluar");
        System.out.print("Pilihan: ");
    }

    static void cariBarang(Scanner scanner, Gudang gudang) {
        System.out.print("Masukkan kata kunci nama barang: ");
        String kataKunci = scanner.nextLine();

        ArrayList<Barang> hasilPencarian = gudang.cariBarang(kataKunci);
        if (hasilPencarian.isEmpty()) {
            System.out.println("Barang tidak ditemukan.");
        } else {
            System.out.println("\nHasil Pencarian:");
            System.out.println("| Kode Barang  | Nama            | Kategori   | Harga Satuan  | Stok |");
            System.out.println("======================================================================");
            for (Barang barang : hasilPencarian) {
                System.out.println(barang);
            }
        }
    }

    static void tambahStok(Scanner scanner, Gudang gudang) {
        gudang.tampilkanDataBarang();
        System.out.print("Masukkan kode barang yang ingin ditambah stoknya: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Masukkan jumlah stok yang ditambahkan: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 

        gudang.tambahStok(kodeBarang, jumlah);
    }

    static void kurangiStok(Scanner scanner, Gudang gudang) {
        gudang.tampilkanDataBarang();
        System.out.print("Masukkan kode barang yang ingin dikurangi stoknya: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Masukkan jumlah stok yang dikurangi: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 

        gudang.kurangiStok(kodeBarang, jumlah);
    }
}
