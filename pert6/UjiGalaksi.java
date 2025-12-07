package pert6;

public class UjiGalaksi {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM KENDARAAN GALAKSI ===");

        // ==============================
        // PESAWAT TEMPUR
        // ==============================
        System.out.println("\n--- PESAWAT TEMPUR ---");

        PesawatTempur p = new PesawatTempur("Astra-Fury", 2, 8);

        p.aktifkanMesin();
        p.jelajah(10);
        p.jelajah(30);
        p.tembakRudal(3);
        p.tampilStatus();


        // ==============================
        // KAPAL EKSPLORASI
        // ==============================
        System.out.println("\n--- KAPAL EKSPLORASI ---");

        KapalEksplorasi k = new KapalEksplorasi("Voyager X", 10, 4);

        k.aktifkanMesin();
        k.jelajah(15);
        k.scanPlanet("Kepler-442b");
        k.tampilStatus();
    }
}
