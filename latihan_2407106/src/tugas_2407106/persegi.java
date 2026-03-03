package tugas_2407106;

public class persegi {
    

    private int sisi;   // PRIVATE (disembunyikan)

    public persegi(int sisi) {   // PUBLIC constructor
        this.sisi = sisi;
    }

    public int hitungLuas() {    // PUBLIC method
        return sisi * sisi;
    }

    public int hitungKeliling() {
        return 4 * sisi;
    }

    // Getter
    public int getSisi() {
        return sisi;
    }

    // Setter
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}