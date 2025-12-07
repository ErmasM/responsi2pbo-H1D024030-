public interface KaryawanKontrak {
    
    // METHOD ABSTRAK
    double hitungGaji(int jamKerja);
    void perpanjangKontrak(int durasiBulan);

    // DEFAULT METHOD
    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
}
