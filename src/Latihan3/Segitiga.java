package Latihan3;

public class Segitiga extends Bentuk {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: Segitiga");
        System.out.println("Luas Segitiga (alas: " + alas + ", tinggi: " + tinggi + "): " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }
}
