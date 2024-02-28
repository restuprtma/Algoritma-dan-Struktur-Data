package Jobsheet3;

import java.util.Scanner;
public class ArrayObjects {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 

        System.out.print("Masukkan jumlah persegi panjang: ");
        PersegiPanjang[] ppArray = new PersegiPanjang[sc.nextInt()];


        for (int i = 0; i < ppArray.length; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjeng ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }

        PersegiPanjang[][] ppArray2 = new PersegiPanjang[3][2];

        ppArray2[0][0] = new PersegiPanjang();
        ppArray2[0][0].panjang = 100;
        ppArray2[0][0].lebar = 40;
        
        System.out.println("Persegi Panjang ke-0 Panjang: " + ppArray2[0][0].panjang + ", Lebar: " + ppArray2[0][0].lebar);
    
        sc.close();
    }
    
}
