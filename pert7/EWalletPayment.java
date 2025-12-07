public class EWalletPayment implements PaymentMethod {

    // atribut
    private String namaLayanan;     // contoh: Dana, OVO, Gopay
    private double nominal;         // nominal pembayaran
    private double saldo;           // saldo pengguna


    // constructor
    public EWalletPayment(String namaLayanan, double nominal, double saldo) {
        this.namaLayanan = namaLayanan;
        this.nominal = nominal;
        this.saldo = saldo;
    }


    // implementasi method interface
    @Override
    public void processPayment() {
        double total = nominal + getTransactionFee();

        System.out.println("Memproses pembayaran sebesar " + nominal + "...");

        if (saldo >= total) {
            saldo -= total;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Layanan: " + namaLayanan +
               " | Nominal: " + nominal +
               " | Biaya transaksi: " + getTransactionFee();
    }

    @Override
    public double getTransactionFee() {
        return 2000;   // biaya tetap
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
