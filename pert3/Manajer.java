// subclass mewarisi Karyawan
class Manajer extends Karyawan {
    // variabel tambahan
    double tunjangan;

    // constructor
    Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok); // panggil constructor parent
        this.tunjangan = tunjangan;
    }

    // override tampilInfo
    @Override
    void tampilInfo() {
        System.out.println("Nama: " + nama
                + " | Gaji Pokok: Rp " + gajiPokok
                + " | Tunjangan: Rp " + tunjangan);
        double total = gajiPokok + tunjangan;
        System.out.println("Total Pendapatan: Rp " + total);
    }
}
