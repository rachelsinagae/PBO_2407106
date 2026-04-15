package tugas6april26;

class BangunDatar {
    // atribut (enkapsulasi: private)
    private double panjang;
    private double lebar;

    // constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // method hitung luas

    public double hitungLuas (){
        return panjang * lebar * 2;
    }

    public double hitungVlume () {
        return 0;
    }
}
