import java.util.Scanner;

public class senjata {
    int jumlahPeluru, jumlahSenjata;
    String senjata, namaSenjata, warnaSenjata;
    Scanner in = new Scanner(System.in);


    public int getJumlahSenjata() {
        jumlahSenjata = in.nextInt();
        return jumlahSenjata;
    }

    public void setJumlahSenjata(int jumlahSenjata) {
        this.jumlahSenjata = jumlahSenjata;

    }

    public int getJumlahPeluru() {
        jumlahPeluru = 30;
        return jumlahPeluru;
    }

    public void setJumlahPeluru(int jumlahPeluru) {

        this.jumlahPeluru = jumlahPeluru;
    }

    public String getSenjata() {
        return senjata;
    }

    public void setSenjata(String senjata) {
        this.senjata = senjata;

    }

    public String getNamaSenjata() {

        return namaSenjata;
    }

    public void setNamaSenjata(String namaSenjata) {

        this.namaSenjata = namaSenjata;
    }

    public String getWarnaSenjata() {

        return warnaSenjata;
    }

    public void setWarnaSenjata(String warnaSenjata) {

        this.warnaSenjata = warnaSenjata;
    }


}
