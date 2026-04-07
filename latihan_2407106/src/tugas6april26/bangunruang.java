package tugas6april26;

class BangunRuang extends BangunDatar {
    private double tinggi;

    // constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari parent class
        this.tinggi = tinggi;
    }

    // method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi; // reuse method dari parent
    }
}