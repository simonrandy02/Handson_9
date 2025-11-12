package Latihan1;

public class IntroToAbstractionPractice {
    public static void main(String[] args) {
        System.out.println("=== TANPA ABSTRACTION ===");

        // TANPA abstraction → bisa buat objek dari class umum (tidak spesifik)
        HewanBiasa hewan = new HewanBiasa("Hewan Umum");
        hewan.bersuara(); // Output: Hewan Umum mengeluarkan suara umum...

        System.out.println("\n=== DENGAN ABSTRACTION ===");

        // Dengan abstraction → hanya subclass yang bisa dibuat objeknya
        Kucing kucing = new Kucing("Kitty");
        kucing.bersuara();
        kucing.makan();
        kucing.tidur();

        Anjing anjing = new Anjing("Bobby");
        anjing.bersuara();
        anjing.makan();
        anjing.tidur();

        Burung burung = new Burung("Tweety");
        burung.bersuara();
        burung.makan();
        burung.tidur();

        System.out.println("\n=== DEMONSTRASI ABSTRACTION ===");

        // Polymorphism menggunakan array Hewan
        Hewan[] hewanArray = new Hewan[3];
        hewanArray[0] = new Kucing("Kitty");
        hewanArray[1] = new Anjing("Bobby");
        hewanArray[2] = new Burung("Tweety");

        for (Hewan h : hewanArray) {
            h.bersuara();
        }

        System.out.println("\n=== KEUNTUNGAN ABSTRACTION ===");

        /*
         * KEUNTUNGAN ABSTRACTION:
         * 1. Mencegah pembuatan objek dari class yang terlalu umum.
         * 2. Memaksa subclass untuk memiliki perilaku spesifik (seperti bersuara()).
         * 3. Memudahkan pengorganisasian dan pemeliharaan kode.
         * 4. Mendukung polymorphism dan fleksibilitas dalam OOP.
         * 5. Memisahkan konsep umum dan detail implementasi.
         */
    }
}
