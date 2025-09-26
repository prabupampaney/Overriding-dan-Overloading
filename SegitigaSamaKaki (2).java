package overloading;

public class SegitigaSamaKaki extends BangunDatar {
    public double hitungLuas() {
        System.out.println("Menghitung luas segitiga sama kaki");
        return 0;
    }

    public double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    public double hitungKeliling(double alas, double sisiMiring) {
        return alas + (2 * sisiMiring);
    }
}
