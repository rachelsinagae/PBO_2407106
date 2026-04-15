package tugas6april26;

class BangunRuang extends BangunDatar {
    private double tinggi;

    // constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari parent class
        this.tinggi = tinggi;
    }

    @Override

     public double hitungLuas() {
        return panjang * lebar * 2 ;
    }

    public double hitungVolume() {
        return 0;
    }
}