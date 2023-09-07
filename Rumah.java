package TugasPBB;

public class Rumah {
    private int tipeRumah;
    private double harga;
    private double pajak;

    public Rumah(int tipeRumah, double harga) {
        this.tipeRumah = tipeRumah;
        this.harga = harga;
        hitungPBB();
    }

    public int getTipeRumah() {
        return tipeRumah;
    }

    public double getHarga() {
        return harga;
    }

    public double getPajak() {
        return pajak;
    }

    public void hitungPBB() {
        if (tipeRumah <= 36) {
            pajak = harga * 0.04;
        } else if (tipeRumah <= 45) {
            pajak = harga * 0.06;
        } else {
            pajak = harga * 0.09;
        }
    }
}
