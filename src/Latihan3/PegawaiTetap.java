package Latihan3;

public class PegawaiTetap extends Pegawai {
    private double bonusTahunan;

    public PegawaiTetap(String nama, double gajiPokok, double bonusTahunan) {
        super(nama, gajiPokok);
        this.bonusTahunan = bonusTahunan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Pegawai Tetap: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Bonus Tahunan: Rp " + bonusTahunan);
        System.out.println("Total Gaji: Rp " + (gajiPokok + bonusTahunan));
    }
}
