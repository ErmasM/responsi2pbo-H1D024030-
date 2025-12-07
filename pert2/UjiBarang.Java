class UjiBarang {
    public static void main(String[] args) {

        // Barang pertama: gitar (info belum lengkap)
        BarangMusik gitar = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        // Atur harga gitar
        gitar.ubahHarga(1500000);

        // Tambah stok gitar
        gitar.tambahStok(5);

        // Barang kedua: drum (info lengkap)
        BarangMusik drum = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000, 3);

        // Tampilkan hasil
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}
