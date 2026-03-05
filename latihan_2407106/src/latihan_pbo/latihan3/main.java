package latihan_pbo.latihan3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("==== KALKULATOR BANGUN DATAR LOVE ====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Pilih bangun datar (1-4): ");
        int pilih = input.nextInt();

        switch (pilih) {

            case 1:
                Persegi p = new Persegi();
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                p.setSisi(sisi);

                System.out.println("Luas: " + p.hitungLuas());
                System.out.println("Keliling: " + p.hitungKeliling());
                break;

            case 2:
                PersegiPanjang pp = new PersegiPanjang();
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();

                pp.setPanjang(panjang);
                pp.setLebar(lebar);

                System.out.println("Luas: " + pp.hitungLuas());
                System.out.println("Keliling: " + pp.hitungKeliling());
                break;

            case 3:
                Segitiga s = new Segitiga();
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                s.setAlas(alas);
                s.setTinggi(tinggi);

                System.out.println("Luas: " + s.hitungLuas());

                System.out.print("Masukkan sisi1: ");
                double s1 = input.nextDouble();
                System.out.print("Masukkan sisi2: ");
                double s2 = input.nextDouble();
                System.out.print("Masukkan sisi3: ");
                double s3 = input.nextDouble();

                System.out.println("Keliling: " + s.hitungKeliling(s1, s2, s3));
                break;

            case 4:
                Lingkaran l = new Lingkaran();
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                l.setSisi(r);

                System.out.println("Luas: " + l.hitungLuas());
                System.out.println("Keliling: " + l.hitungKeliling());
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
