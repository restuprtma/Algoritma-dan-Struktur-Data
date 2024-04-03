package Jobsheet4;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.print("Masukkan jumlah elemen : ");
        int jml = sc.nextInt();

        Faktorial[] fk = new Faktorial[jml];
        for(int i = 0; i < jml ; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" +(i+1)+ " : ");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for(int i = 0; i < jml; i++){
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DiVIDE AND CONQUER");
        for(int i = 0; i < jml; i++){
            System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }

    sc.close();
    }

}
