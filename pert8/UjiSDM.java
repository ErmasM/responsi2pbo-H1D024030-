public class UjiSDM {
    public static void main(String[] args) {
        
        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===");

        // 1. Membuat objek
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        // 2. Hitung gaji
        andi.hitungGaji(160);

        // 3. Status cuti
        System.out.println("Status Cuti: " + andi.getStatusCuti());

        // 4. Login gagal
        andi.login("9999");

        // 5. Login berhasil
        andi.login("1234");

        // 6. Role akses
        System.out.println("Role Akses: " + andi.getRoleAkses());

        // 7. Perpanjang kontrak
        andi.perpanjangKontrak(6);

        // 8. Logout
        andi.logout();
    }
}