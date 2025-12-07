package pert6;

public class KapalEksplorasi extends KendaraanGalaksi {

    // atribut tambahan
    private int modulScan;


    // constructor
    public KapalEksplorasi(String nama, int kapasitas, int modulScan) {
        super(nama, kapasitas);
        this.modulScan = modulScan;
    }


    // implementasi abstract method
    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    void jelajah(int jarak) {
        int konsumsi = jarak * 2; // konsumsi energi 2% per km

        if (getLevelEnergi() < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setLevelEnergi(getLevelEnergi() - konsumsi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        setLevelEnergi(getLevelEnergi() + jumlah);
        System.out.println("Mengisi energi... Energi sekarang: " + getLevelEnergi() + "%");
    }


    // method khusus eksplorasi planet
    void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet
                + " dengan modul level " + modulScan + ".");
    }
}
