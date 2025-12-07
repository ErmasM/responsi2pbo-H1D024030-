class analisisMesin {
    public static void main(String[] args) {

        // Array mesin
        defaultMesin[] daftar = new defaultMesin[5];

        daftar[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftar[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        daftar[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        daftar[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        daftar[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        for (defaultMesin m : daftar) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");

        for (defaultMesin m : daftar) {
            System.out.print(m.namaMesin + " → ");
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        double max = 0;
        defaultMesin terbaik = null;

        for (defaultMesin m : daftar) {
            if (m.nilaiPerforma() > max) {
                max = m.nilaiPerforma();
                terbaik = m;
            }
        }

        System.out.println(terbaik.namaMesin + " → " + max);

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        for (int i = 0; i < daftar.length - 1; i++) {
            for (int j = 0; j < daftar.length - i - 1; j++) {
                if (daftar[j].nilaiPerforma() < daftar[j+1].nilaiPerforma()) {
                    defaultMesin temp = daftar[j];
                    daftar[j] = daftar[j+1];
                    daftar[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " +
                    daftar[i].namaMesin +
                    " → " + daftar[i].nilaiPerforma());
        }
    }
}
