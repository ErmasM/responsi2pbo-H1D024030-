package pert6;

public abstract class KendaraanGalaksi {

    // =======================
    // ATRIBUT
    // =======================
    private String namaKendaraan;
    private int levelEnergi;   // 0–100
    private int kapasitasPenumpang;


    // =======================
    // CONSTRUCTOR
    // =======================
    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100;  // default energi penuh
    }


    // =======================
    // GETTER
    // =======================
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }


    // setter energi diproteksi oleh batas 0–100
    public void setLevelEnergi(int energi) {
        if (energi < 0) energi = 0;
        if (energi > 100) energi = 100;
        this.levelEnergi = energi;
    }


    // =======================
    // METHOD UMUM
    // =======================
    public final void tampilStatus() {
        System.out.println(getNamaKendaraan()
                + " | Energi: " + getLevelEnergi() + "%"
                + " | Kapasitas: " + getKapasitasPenumpang() + " orang");
    }


    // =======================
    // ABSTRACT METHOD
    // =======================
    abstract void aktifkanMesin();
    abstract void jelajah(int jarak);
    abstract void isiEnergi(int jumlah);
}
