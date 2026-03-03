package tugas_2407106;

public class lingkaran {


    private int jariJari;

    public lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    public int hitungLuas() {
        return 3 * jariJari * jariJari;
    }

    public int hitungKeliling() {
        return 2 * 3 * jariJari;
    }
}
