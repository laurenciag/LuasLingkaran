import java.util.Scanner;

public abstract class abstrakSenjata {

    public abstract void nembakSenjata();

    public abstract void reloadSenjata();
}

class action extends abstrakSenjata {

    int jumlahPeluru;
    inputSenjata at = new inputSenjata();

    @Override
    public void nembakSenjata() {
        jumlahPeluru = at.getJumlahPeluru() - 1;
        System.out.println("Sisa peluru :"+jumlahPeluru);
    }

    @Override
    public void reloadSenjata() {
        jumlahPeluru = at.getJumlahPeluru();
        System.out.println("Sisa peluru :"+jumlahPeluru);
    }
}

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        action ac = new action();
        ActionSenjata as = new ActionSenjata();

        as.head();
        System.out.println("Apa yang ingin Anda lakukan?\n1. Nembak\n2. Reload");
        int inputAction = in.nextInt();

        if (inputAction == 1) {
            ac.nembakSenjata();
        } else {
            ac.reloadSenjata();
        }

        }

    }
