package OP;

public class Staff extends Karyawan{

    private int lembur;
    private double gajiLembur;

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public double getGaji(){
        Karyawan a = new Karyawan();
        return super.getGaji() + lembur* gajiLembur;
    }

    public void liatInfo(){
        System.out.println("NIP : "+this.getNip());
        System.out.println("Nama : "+this.getNama());
        System.out.println("Golongan : "+this.getGolongan());
        System.out.println("Jumlah Lembur : "+this.getLembur());
        System.out.printf("Gaji Lembur : %.0f\n", this.getGajiLembur());
        System.out.printf("Gaji : %.0f\n", this.getGaji());
        System.out.println();
    }
}
