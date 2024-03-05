package Jobsheet3;

public class LimasS4SmSisi{
    double sisiAlas;
    double tinggi;

    LimasS4SmSisi(double s, double t){
        sisiAlas = s;
        tinggi = t;
    }
    double hitungLuasAlas(){
        return Math.pow(sisiAlas, 2);
    }
    double hitungLuassisiAlasTegak(){
        double miring = Math.sqrt(Math.pow(sisiAlas / 2, 2) + Math.pow(tinggi, 2));
        return (sisiAlas / miring) / 2;
    }
    double hitungLuasPermukaan(){
        return hitungLuasAlas() + 4 * hitungLuassisiAlasTegak();
    }
    double hitungVolume(){
         return (1/3) * hitungLuasAlas() * tinggi;
    }    
    
}

