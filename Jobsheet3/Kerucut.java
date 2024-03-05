package Jobsheet3;

public class Kerucut {
    double jariJari;
    double sisiMiring;

    Kerucut(double r, double sm){
        jariJari = r;
        sisiMiring = sm;
    }
    double hitungLuasPermukaan(){
        double garisPelukis = Math.sqrt(Math.pow(jariJari, 2) + Math.pow(sisiMiring, 2));
        return Math.PI * jariJari * (garisPelukis + jariJari);
    }
    double hitungVolume(){
        return (1/3) * Math.PI * Math.pow(jariJari, 2) * sisiMiring;
    }
}
