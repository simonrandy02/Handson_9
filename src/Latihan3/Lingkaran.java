package Latihan3;

public class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Bentuk: Lingkaran");
        System.out.println("Luas Lingkaran dengan radius " + radius + ": " + String.format("%.2f", hitungLuas()));
        System.out.println("Keliling: " + String.format("%.2f", hitungKeliling()));
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}
