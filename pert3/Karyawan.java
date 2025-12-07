class Karyawan {
    // variabel dasar
    protected String nama;
    protected double gajiPokok;

    // constructor
    Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // method tampil info
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}
