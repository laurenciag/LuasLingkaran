import java.util.Scanner;

public class inputSenjata  extends senjata{

    String[] listSenjata = {"pistol","atomatic rifle","shotgun","smg"};
    Scanner in = new Scanner(System.in);

    public void lihatSenjata(){

        System.out.println("Berikut list senjata yang dapat dipilih:");
        for (int a=0; a< listSenjata.length; a++) {
            System.out.println((a+1) + "." + listSenjata[a]);
        }

    }

    public void inputJumlah(){
        System.out.print("Masukan jumlah senjata :" );
        //int JumlahSenjata = in.nextInt();
        this.getJumlahSenjata();
    }

    public void inputWarna(){
        System.out.print("Masukan warna senjata :");
        String warnaSenjata = in.nextLine();
        this.getWarnaSenjata();
    }

    public void inputSenjata(){
        lihatSenjata();
        for (int a = 0; a < jumlahSenjata; a++){
            System.out.print("Masukan senjata :");
            String namaSenjata = in.nextLine();
            inputWarna();
        }
    }

}
