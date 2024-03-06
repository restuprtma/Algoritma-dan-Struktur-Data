package quiz;

public class Pegawai {
    
    String nama;
    int masaKerjaThn;
    double jamLembur;
    int gajiPokok;

    public Pegawai(String nama, int masaKerjaThn, double jamLembur, int gajiPokok){
        this.nama = nama;
        this.masaKerjaThn = masaKerjaThn;
        this.jamLembur = jamLembur;
        this.gajiPokok = gajiPokok;
    }

    double hitungGajiLembur(){
        if(masaKerjaThn < 5){
            return 0.05 * gajiPokok;
        } else {
            return 0.10 * gajiPokok;
        }
    }

    double hitungTunjangan(){
        if(masaKerjaThn < 5){
            return 0.25 * gajiPokok;
        }else {
            return 0.50 * gajiPokok;
        }
    }

    double hitungGajiTotal(){
        return gajiPokok + hitungGajiLembur() + hitungTunjangan();
    }

    void printData(){
        System.out.println("Nama        : " +nama);
        System.out.println("Masa Kerja  : " +masaKerjaThn+ " Tahun");
        System.out.println("Gaji Pokok  : Rp." +gajiPokok);
        System.out.println("Jam Lembur  : " +jamLembur+ " Jam");
        System.out.println("Gaji Lembur : Rp." +hitungGajiLembur());
        System.out.println("Tunjangan   : Rp." +hitungTunjangan());
        System.out.println("Gaji Total  : Rp." +hitungGajiTotal());
    }
}
