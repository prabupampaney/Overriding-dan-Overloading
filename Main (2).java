package overloading;

public class Main {
    public static void main(String[] args) {
        SegiEmpat se = new SegiEmpat();
        System.out.println("Luas persegi: " + se.hitungLuas(4));
        System.out.println("Luas persegi panjang: " + se.hitungLuas(4,6));
        System.out.println("Keliling persegi: " + se.hitungKeliling(4));
        System.out.println("Keliling persegi panjang: " + se.hitungKeliling(4,6));

        SegitigaSamaKaki ssk = new SegitigaSamaKaki();
        System.out.println("Luas segitiga sama kaki: " + ssk.hitungLuas(6,8));
        System.out.println("Keliling segitiga sama kaki: " + ssk.hitungKeliling(6,5));

        Lingkaran l = new Lingkaran();
        System.out.println("Luas lingkaran: " + l.hitungLuas(7));
        System.out.println("Keliling lingkaran: " + l.hitungKeliling(7));
    }
}
