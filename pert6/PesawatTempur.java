package pert6;

public class PesawatTempur extends KendaraanGalaksi {

    // atribut tambahan
    private int jumlahRudal;


    // constructor
    public PesawatTempur(String nama, int kapasitas, int jumlahRudal) {
        super(nama, kapasitas);
        this.jumlahRudal = jumlahRudal;
    }


    // implementasi abstract method
    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    void jelajah(int jarak) {
        int konsumsi = jarak * 3; // konsumsi energi 3% per km

        if (getLevelEnergi() < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setLevelEnergi(getLevelEnergi() - konsumsi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        setLevelEnergi(getLevelEnergi() + jumlah);
        System.out.println("Energi bertambah... Energi sekarang: " + getLevelEnergi() + "%");
    }


    // method spesifik pesawat tempur
    void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak mencukupi!");
        }
    }
}
