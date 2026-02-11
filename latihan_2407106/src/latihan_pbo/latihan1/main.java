package latihan_pbo.latihan1;

class Cafe{
    String nama;
    String alamat;

    //constructor
    Cafe(String nama, String alamat){
        this.nama = "nama"; 
        this.alamat = "alamat";
        System.out.println("Nama Cafe nya adalah : " + nama);
        System.out.println("Alamatnya di : " + alamat);
        System.out.println("==========");

        //method

        }


        public String getNama() {
            return nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
        public String getAlamat() {
            return alamat;
        }
        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }
        void buka(){
            System.out.println("==========");
            System.err.println("Cafe sudah buka");

}
}
public class main {
    public static void main(String[] args) {
        Cafe Cafe1 = new Cafe ("Janji Jiwa", "Indramayu");
        Cafe Cafe2 = new Cafe ("Kopi Kenangan", "Cirebon");
        Cafe Cafe3 = new Cafe ("Tomoro", "Bandung");
        Cafe1.buka();
    }
}


