package tugas_2407106;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== KALKULATOR BANGUN DATAR LOVE ====");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi Panjang");
        System.out.println("3.Segitiga");
        System.out.println("4.Lingkaran");
        System.out.println("Pilih bangun datar yang mana (1-4):");
        int Pilih = input.nextInt();

        if (Pilih == 1){
            System.out.println("Masukan Sisi : ");
            int sisi = input.nextInt();
            persegi p = new persegi(sisi);
            System.out.println("Luas:" + p.hitungLuas());
            System.out.println("Keliling:" + p.hitungKeliling());
        
        } else if (Pilih == 2) {
            System.out.println("Masukan panjang : ");
            int panjang = input.nextInt();
            System.out.println("Masukan lebar :");
            int lebar = input.nextInt();
            persegipanjang pp = new persegipanjang(panjang, lebar);
            System.out.println("Luas:" + pp.hitungLuas());
            System.out.println("Keliling:" + pp.hitungKeliling());

        } else if ( Pilih == 3) {
            System.out.println("Masukan alas :");
            int alas = input.nextInt();
            System.out.println("Masukan tinggi :");
            int tinggi = input.nextInt();
            System.out.println("Masukin sisi1 :");
            int sisi1 = input.nextInt();
            System.out.println("Masukan sisi2 :");
            int sisi2 = input.nextInt();
            System.out.println("Masukan sisi3 :");
            int sisi3 = input.nextInt();

            segitiga s = new segitiga(alas, tinggi, sisi1, sisi2, sisi3);
            System.out.println("Luas:" + s.hitungLuas());
            System.out.println("Keliling:" + s.hitungKeliling());

        } else if ( Pilih == 4) {
            System.out.println("Masukan jari - jari :");
            int r = input.nextInt();
            lingkaran l = new lingkaran(r);
            System.out.println("Luas:" + l.hitungLuas());
            System.out.println("Keliling:" + l.hitungKeliling());
        }else{
            System.out.println("Pilihan tidaj valid !");
        }

    }
}