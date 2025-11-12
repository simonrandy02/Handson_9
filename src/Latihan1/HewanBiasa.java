package Latihan1;

public class HewanBiasa {
    protected String nama;

    public HewanBiasa(String nama) {
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara umum...");
    }

    public void makan() {
        System.out.println(nama + " sedang makan");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur");
    }
}
