class UjiKaryawan {
    public static void main(String[] args) {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // objek karyawan biasa
        Karyawan k1 = new Karyawan("Budi Santoso", 4000000);

        System.out.println("Status: Karyawan Biasa");
        k1.tampilInfo();

        System.out.println(); // jarak

        // objek manajer
        Manajer m1 = new Manajer("Siti Aminah", 6000000, 2500000);

        System.out.println("Status: Manajer");
        m1.tampilInfo();
    }
}
