class Member extends Customer {
    // atribut tambahan khusus member
    int poin;
    String level;

    // constructor menggunakan super
    Member(String nama, String idCustomer, int totalBelanja, int poin, String level) {
        super(nama, idCustomer, totalBelanja);
        this.poin = poin;
        this.level = level;
    }

    // override tampilkanInfo
    @Override
    void tampilkanInfo() {
        // tampilkan info dasar dari parent
        super.tampilkanInfo();
        // tampilkan info tambahan
        System.out.println("Poin Reward: " + poin + " | Level: " + level);
    }
}
