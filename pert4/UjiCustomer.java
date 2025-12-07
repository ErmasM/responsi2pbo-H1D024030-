public class UjiCustomer {
    public static void main(String[] args) {

        // object customer biasa
        Customer c1 = new Customer("Budi Santoso", "CST-001", 500000);

        // object member
        Member m1 = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // judul
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // tampilkan info customer biasa
        System.out.println("Status: Customer Biasa");
        c1.tampilkanInfo();

        System.out.println(); // jarak

        // tampilkan info member
        System.out.println("Status: Member");
        m1.tampilkanInfo();
    }
}
