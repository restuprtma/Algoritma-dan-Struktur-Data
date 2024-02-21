package Jobsheet1;

/**
 * Pemilihan
 */
import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tugas, kuis, UTS, UAS;
        // boolean inputValid;


        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=========================");
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        kuis = input.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        UTS = input.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        UAS = input.nextInt();
        System.out.println("=========================");
        System.out.println("=========================");

        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * UTS) + (0.4 + UAS);

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100) {
            System.out.println("Nilai tidak valid!");
            return;
        }

        String nilaiHuruf;
        String keterangan;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
            keterangan = "Sangat Baik";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
            keterangan = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
            keterangan = "Baik";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
            keterangan = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
            keterangan = "Cukup";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
            keterangan = "Kurang";
        } else {
            nilaiHuruf = "E";
            keterangan = "Gagal";
        }


        String statusLulus;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            statusLulus = "LULUS";
        } else {
            statusLulus = "TIDAK LULUS";
        }

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
        System.out.println("Status: " + statusLulus);


        
    }
}