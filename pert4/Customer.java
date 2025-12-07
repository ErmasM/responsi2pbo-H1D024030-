class Customer {
    // atribut dasar
    String nama;
    String idCustomer;
    int totalBelanja;

    // constructor
    Customer(String nama, String idCustomer, int totalBelanja) {
        this.nama = nama;
        this.idCustomer = idCustomer;
        this.totalBelanja = totalBelanja;
    }

    // method tampilkan info dasar
    void tampilkanInfo() {
        System.out.println("Nama: " + nama +
                " | ID: " + idCustomer +
                " | Total Belanja: Rp " + totalBelanja);
    }
}
