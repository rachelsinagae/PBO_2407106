package latihan_pbo.latihan3;

public class Segitiga extends BangunDatar {

    public double hitungLuas() {
        return (getAlas() * getTinggi()) / 2;
    }

    public double hitungKeliling(double sisi1, double sisi2, double sisi3) {
        return sisi1 + sisi2 + sisi3;
    }
}