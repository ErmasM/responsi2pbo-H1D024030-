public class PaymentTest {

    public static void main(String[] args) {

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        // membuat objek e-wallet
        EWalletPayment ewallet = new EWalletPayment("DANA", 50000, 150000);

        // menampilkan saldo awal
        System.out.println("Saldo awal: " + ewallet.getBalance());

        // proses pembayaran
        ewallet.processPayment();

        // menampilkan detail pembayaran
        System.out.println(ewallet.getPaymentDetails());

        // menampilkan saldo akhir
        System.out.println("Saldo akhir: " + ewallet.getBalance());
    }
}
