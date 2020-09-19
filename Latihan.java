import java.util.Scanner;
public class Latihan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int NilaiAwal = 2;
        int NilaiAkhir = 5;

        // int Total = NilaiAkhir

        System.out.print("Masukkan Nilai1 : ");
        int nilaiInput1 = in.nextInt();

        System.out.print("Masukkan Nilai2 : ");
        int nilaiInput2 = in.nextInt();

        System.out.print("Masukkan Nilai3 : ");
        double nilaiInput3 = in.nextDouble();

        double total = ((NilaiAkhir * nilaiInput1)+NilaiAwal) / (nilaiInput3+nilaiInput2);
        System.out.println("Hasilnya adalah: "+total);

    }

}
