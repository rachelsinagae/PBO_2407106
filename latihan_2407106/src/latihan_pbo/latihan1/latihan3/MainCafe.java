package latihan_pbo.latihan1.latihan3;
import java.util.Scanner;

class Cafe {

    private int espresso;
    private int susu;
    private int foam;
    private int airPanas;

    // Constructor
    public Cafe(int espresso, int susu, int foam, int airPanas) {
        this.espresso = espresso;
        this.susu = susu;
        this.foam = foam;
        this.airPanas = airPanas;
    }

    public String tentukanMenu() {

        if (espresso > 0 && foam == 1 && susu == 0 && airPanas == 0) {
            return "1. MACCHIATO";
        } 
        else if (espresso > 0 && foam >= 3 && susu > 0) {
            return "2. CAPPUCCINO";
        } 
        else if (espresso > 0 && foam == 2 && susu > 0) {
            return "3. CAFE LATTE";
        } 
        else if (espresso > 0 && airPanas > 0 && susu == 0 && foam == 0) {
            return "4. AMERICANO";
        } 
        else {
            return "Menu Tidak Diketahui";
        }
    }

    public String perbandinganBahan() {

        if (foam > susu) {
            return "Foam lebih banyak dari Susu";
        } 
        else if (foam < susu) {
            return "Susu lebih banyak dari Foam";
        } 
        else {
            return "Foam dan Susu sama banyak";
        }
    }

    public void tampilDetail() {
        System.out.println("Espresso  : " + espresso);
        System.out.println("Susu      : " + susu);
        System.out.println("Foam      : " + foam);
        System.out.println("Air Panas : " + airPanas);
    }
}


public class MainCafe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("========== MENU CAFE ==========");
        System.out.println("1. Macchiato  = Espresso + sedikit Foam");
        System.out.println("2. Cappuccino = Espresso + banyak Foam + Susu");
        System.out.println("3. Cafe Latte = Espresso + Foam sedang + Susu");
        System.out.println("4. Americano  = Espresso + Air Panas");
        System.out.println("================================");

        System.out.println("\n=== MASUKKAN TAKARAN ===");

        System.out.print("Masukkan Espresso : ");
        int espresso = input.nextInt();

        System.out.print("Masukkan Susu     : ");
        int susu = input.nextInt();

        System.out.print("Masukkan Foam     : ");
        int foam = input.nextInt();

        System.out.print("Masukkan Air Panas: ");
        int airPanas = input.nextInt();

        Cafe pesanan = new Cafe(espresso, susu, foam, airPanas);

        System.out.println("\n=== RINCIAN BAHAN YANG DI-MIX ===");
        pesanan.tampilDetail();

        System.out.println("\nHASIL MIX : " + pesanan.tentukanMenu());
        System.out.println("KONDISI   : " + pesanan.perbandinganBahan());

        System.out.println("================================");

        input.close();
    }
}