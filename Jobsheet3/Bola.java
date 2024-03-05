package Jobsheet3;

public class Bola {
    double jariJari;

    Bola(double r){
        jariJari = r;
    }
    double hitungLuasPermukaan(){
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
    double hitungVolume(){
        return (4/3) * Math.PI * Math.pow(jariJari, 3);
    }
}
