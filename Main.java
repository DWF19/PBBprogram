package TugasPBB;

public class Main {
    public static void main(String[] args) {
        Rumah rumahAkbar = new Rumah(36, 10_000_000.0);
        Rumah rumahBambang = new Rumah(45, 20_000_000.0);
        Rumah rumahCharlie = new Rumah(90, 90_000_000.0);

        Ayah ayahAkbar = new Ayah("Akbar", rumahAkbar);
        Ayah ayahBambang = new Ayah("Bambang", rumahBambang);
        Ayah ayahCharlie = new Ayah("Charlie", rumahCharlie);

        System.out.println("Nama Pemilik Rumah - Tipe Rumah - Pajak (juta)");
        System.out.println(ayahAkbar.getNama() + " - " + rumahAkbar.getTipeRumah() + " - "  + rumahAkbar.getPajak());
        System.out.println(ayahBambang.getNama() + " - " + rumahBambang.getTipeRumah() + " - " + rumahBambang.getPajak());
        System.out.println(ayahCharlie.getNama() + " - " + rumahCharlie.getTipeRumah() + " - " + rumahCharlie.getPajak());

        /* jika ingin Mengubah nama Ayah
        ayahAkbar.setNama("");
        ayahBambang.setNama("");
        ayahCharlie.setNama("");
*/

    }
}
