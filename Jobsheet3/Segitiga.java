package Jobsheet3;

public class Segitiga {

    public int alas, tinggi;

    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }
    public double hitungKeliling(){
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }

}