package Jobsheet3;

import java.util.Scanner;

public class MainBangunRuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Bangun Ruang : ");
        int jumlah = sc.nextInt();

        Kerucut[] kerucut = new Kerucut[jumlah];
        Bola[] bola = new Bola[jumlah];
        LimasS4SmSisi[] limas = new LimasS4SmSisi[jumlah];

        for(int i = 0; i < jumlah; i++){
            System.out.println("kerucut ke-" +(i+1));
            System.out.print("Jari - jari : ");
            double rKerucut = sc.nextDouble();
            System.out.print("Sisi Miring : ");
            double smKerucut = sc.nextDouble();
            kerucut[i] = new Kerucut(rKerucut, smKerucut);

            System.out.println("Limas Segi Empat Sama Sisi ke-" +(i+1));
            System.out.print("Sisi Alas : ");
            double saLimas = sc.nextDouble();
            System.out.print("Tinggi : ");
            double tLimas = sc.nextDouble();
            limas[i] = new LimasS4SmSisi(saLimas, tLimas);

            System.out.println("Bola ke-" +(i+1));
            System.out.print("Jari - jari : ");
            double rBola = sc.nextDouble();
            bola[i] = new Bola(rBola);          
        }

        for(int i = 0; i < jumlah; i++){
            System.out.println("\nBangun Ruang ke-" + (i+1));
            System.out.println("======            Kerucut               ======");
            System.out.println("Volume : " + kerucut[i].hitungVolume());
            System.out.println("Luas Permukaan : " + kerucut[i].hitungLuasPermukaan());
            System.out.println("======  Limas Segi Empat Sisi Sama Sisi ======");
            System.out.println("Volume : " + limas[i].hitungVolume());
            System.out.println("Luas Permukaan : " + limas[i].hitungLuasPermukaan());
            System.out.println("======              Bola               ======");
            System.out.println("Volume : " + bola[i].hitungVolume());
            System.out.println("Luas Permukaan : " + bola[i].hitungLuasPermukaan());
        }

        sc.close();
    }
}
