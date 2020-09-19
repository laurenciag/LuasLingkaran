import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] angs) {

        Scanner in = new Scanner(System.in);

        double count = 0;

        System.out.print("Masukan max loop:");
        double nilaiMax = in.nextDouble();

        for (int a = 0; a <= nilaiMax; a++) {
            System.out.println("Ini adalah perulangan Ke-" + (a));

            System.out.print("Masukan Nilai Perulangan:");
            double nilaiPerulangan = in.nextDouble();

            if (a % 2 == 0) {
                nilaiPerulangan *= nilaiMax;
            } else {
                nilaiPerulangan /= nilaiMax;

            }

            count += nilaiPerulangan;
            System.out.println("===========================");
        }
        System.out.println("Jumlah :" + count);
    }
}

