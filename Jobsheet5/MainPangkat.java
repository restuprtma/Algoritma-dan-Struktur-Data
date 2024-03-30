package Jobsheet5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i = 0; i < elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            int iNilai = sc.nextInt();
            png[i].nilai = iNilai;
            System.out.print("Masukkan nilai pangkat : ");
            int iPangkat = sc.nextInt();
            png[i].pangkat = iPangkat;
        }

        System.out.println("====================");
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for(int i = 0; i < elemen; i++){
            System.out.println("Hasil dari "
            + png[i].nilai + " pangkat"
            + png[i].pangkat + " adalah "
            + png[i].pangkatBF(png[i].nilai, png[i].pangkat) );
        }

        System.out.println("====================");
        System.out.println("HASIL PANGKAT - DiVIDE AND CONQUER");
        for(int i = 0; i < elemen; i++){
            System.out.println("Hasil dari "
            + png[i].nilai + " pangkat"
            + png[i].pangkat + " adalah "
            + png[i].pangkatDC(png[i].nilai, png[i].pangkat) );
        }

        sc.close();
    }
    
}
