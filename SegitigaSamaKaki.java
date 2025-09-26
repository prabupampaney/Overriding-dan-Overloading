package overriding;

public class SegitigaSamaKaki extends BangunDatar {
    public double alas, tinggi ;
    public SegitigaSamaKaki(double alas, double tinggi){
        this.alas = alas;
        this.tinggi= tinggi;
    }
    public void hitungLuas(){
        luas =0.5*alas*tinggi;
    }
    public void hitungKeliling(){
        double simir = Math.sqrt((0.5*alas*0.5*alas)+(tinggi*tinggi));
        keliling = (2*simir)+alas;
    }
    public void tampilData(){
        System.out.println("Alas = "+alas);
        System.out.println("Tinggi = "+tinggi);
        super.tampilData();
    }
}