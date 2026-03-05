package latihan_pbo.latihan3;

public class Lingkaran extends BangunDatar {

    public double hitungLuas() {
        return Math.PI * getJari() * getJari();
    }

    public double hitungKeliling() {
        return 2 * Math.PI * getJari();
    }
}