package Jobsheet7;
import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Gudang09 gudang = new Gudang09(7);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");            
            System.out.print("Pilih operasi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 :
                    System.out.print("Masukkan kode barang : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String  nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = sc.nextLine();
                    Barang09 barangBaru = new Barang09(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2 :
                    gudang.ambilBarang();
                    break;
                case 3 : 
                    gudang.tampilkanBarang();
                    break;
                case 4 :
                    break;
                default :
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    
    }
}
