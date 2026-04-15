package latihan_pbo.tugas130426;
public class Main {
    public static void main(String[] args) {

        BangunDatar bd;

        // menampilkan BangunDatar (soal 1.d)
        bd = new BangunDatar(3,4);
        bd.tampilkan();

        // Persegi
        bd = new Persegi(5);
        bd.tampilkan();

        // Persegi Panjang
        bd = new PersegiPanjang(6,4);
        bd.tampilkan();

        // Segitiga
        bd = new Segitiga(8,5);
        bd.tampilkan();
    }
}
