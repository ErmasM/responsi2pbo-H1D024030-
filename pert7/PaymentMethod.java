public interface PaymentMethod {

    // memproses pembayaran
    void processPayment();

    // mengembalikan detail pembayaran
    String getPaymentDetails();

    // biaya transaksi (misal Rp 2000)
    double getTransactionFee();

    // mengembalikan saldo
    double getBalance();
}
