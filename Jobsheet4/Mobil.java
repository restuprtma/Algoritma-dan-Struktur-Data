package Jobsheet4;

public class Mobil {
    String merk;
    String tipe;
    int tahun;
    int topAcceleration;
    int topPower;

    public Mobil(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    public String toString(){
        return "Merk: " + merk + ", Tipe: " + tipe + ", Tahun: " + tahun + ", Top Acceleration: " + topAcceleration + ", Top Power: " + topPower;
    }
}
