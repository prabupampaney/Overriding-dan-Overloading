package overloading;

public class Lingkaran extends BangunDatar {
    public double hitungLuas() {
        System.out.println("Menghitung luas lingkaran");
        return 0;
    }

    public double hitungLuas(double jariJari) {
        return 3.14 * jariJari * jariJari;
    }

    public double hitungKeliling(double jariJari) {
        return 2 * 3.14 * jariJari;
    }
}
