import java.util.Scanner;

public class Assignment1 {

    static double luas;
    double p1;
    static int inputR;
    static String loopInput = "y";

    public double scanInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai jari-jari:");
        double inputR=in.nextDouble();
        return inputR;
    }

    public double process() {
        double inputR = scanInput();
        p1=Math.PI;
        luas= p1*inputR*inputR;
        return luas;
    }


    public static void main(String[] args){
        while (loopInput.equalsIgnoreCase("y")) {
            Assignment1 as = new Assignment1();

            System.out.println("Perhitungan Luas Lingkaran");
            System.out.println("============================");
            System.out.printf("Luas : %.2f", as.process());
            System.out.println("");

            new Assignment1().verifyRestart();


        }
    }
    public  void verifyRestart() {
        Scanner in = new Scanner(System.in);
        System.out.println("Apakah anda ingin mengulangi? Y/N");
        loopInput = in.nextLine();
    }

}
