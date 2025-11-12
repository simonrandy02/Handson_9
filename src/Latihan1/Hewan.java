package Latihan1;

public abstract class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    // Abstract method → wajib diimplementasikan subclass
    public abstract void bersuara();

    // Concrete methods → bisa langsung digunakan oleh semua subclass
    public void makan() {
        System.out.println(nama + " sedang makan");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur");
    }
}
