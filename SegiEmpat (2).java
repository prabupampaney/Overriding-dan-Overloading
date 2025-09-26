package overloading;

public class SegiEmpat extends BangunDatar {
    public double hitungLuas() {
        System.out.println("Menghitung luas segiempat");
        return 0;
    }

    public double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    public double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public double hitungKeliling(double sisi) {
        return 4 * sisi;
    }

    public double hitungKeliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }
}
