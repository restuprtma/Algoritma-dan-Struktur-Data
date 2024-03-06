package quiz;

import java.util.Scanner;

public class MainPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Pegawai :");
        int n = input.nextInt();

        Pegawai[] pegawai = new Pegawai[n];

        for(int i = 0; i < n; i++){
            System.out.println("Pegawai ke-" +(i+1));
            System.out.print("Nama        : ");
            String nama = input.next();
            System.out.print("Masa Kerja  : ");
            int masaKerja = input.nextInt();
            System.out.print("Jam Lembur  : ");
            double jamLembur = input.nextDouble();
            System.out.print("Gaji Pokok  : Rp.");
            int gaji = input.nextInt();
            pegawai[i] = new Pegawai(nama, masaKerja, jamLembur, gaji);
        }

        for(int i = 0; i < n; i++) {
            System.out.println("Pegawai ke-" +(i+1));
            pegawai[i].printData();
        }

        double totalGaji = 0;
        int jumlah = 0;
        for(Pegawai pgw : pegawai){
            if(pgw.masaKerjaThn > 5) {
                totalGaji += pgw.hitungGajiTotal();
                jumlah++;
            }
        }
        if(jumlah > 0){
            double rataRataGaji = totalGaji / jumlah;
            System.out.println("====================");
            System.out.println("Rata - rata gaji pegawai dengan masa kerja > 5 tahun adalah : Rp." +rataRataGaji);
        }else{
            System.out.println("Tidak ada pegawai dengan masa kerja > 5 tahun");
        }

        double gajiLemburTerbesar = 0;
        Pegawai lemburTerbesar = null;
        for (Pegawai pgw : pegawai){
            if(pgw.masaKerjaThn < 5 && pgw.hitungGajiLembur() > gajiLemburTerbesar){
                gajiLemburTerbesar = pgw.hitungGajiLembur();
                lemburTerbesar = pgw;
            }
        }
        if(lemburTerbesar != null){
            System.out.println("====================");
            System.out.println("Pegawai dengan gaji lembur terbesar (Masa kerja < 5 Tahun) : ");
            lemburTerbesar.printData();
        }else {
            System.out.println("Tidak ada pegawai dengan masa kerja < 5 tahun");
        }
        input.close();
    }
}
