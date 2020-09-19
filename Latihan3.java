import java.util.Scanner;

public class Latihan3 {

    static String[] listPelajaran = {"Matematika", "B. Indonesia", "B. Inggris"};
    static String loopInput = "y";
    Scanner in = new Scanner(System.in);

    public static void main(String[] angs) {

        while (loopInput.equalsIgnoreCase("y")) {
        //String inputNama,inputKelas,inputPelajaran;

        Scanner in = new Scanner(System.in);

        System.out.println("Hallo Ini Aplikasi Input Data Siswa");

        System.out.println("===================================");

            System.out.print("Masukan Nama :");
            String inputNama = in.nextLine();

            System.out.println("");

            System.out.print("Masukan Kelas :");
            String inputKelas = in.nextLine();

            System.out.println("Mata Pelajaran:");
            printListPelajaran();
            System.out.print("Masukan Mata Pelajaran :");
            int inputPelajaran = in.nextInt();
            //String inputPelajaran = in.nextLine();

            while ((inputPelajaran < 1) || (inputPelajaran > 3)) {
                System.out.print("Mohon dapat diinput kembali.\nMasukan Mata Pelajaran :");
                inputPelajaran = in.nextInt();
            }

            System.out.println("===================================");

            System.out.print("Input Jumlah Kuis :");
            int inputJumlah = in.nextInt();

            double countNilai = 0;
            double averageNilai = countNilai / inputJumlah;
            for (int nilaiKuis = 1; nilaiKuis <= inputJumlah; nilaiKuis++) {
                System.out.print("Nilai Kuis Ke -" + nilaiKuis + ":");
                double inputNilai = in.nextDouble();

                while ((inputNilai > 100) || (inputNilai < 0)) {
                    System.out.print("Mohon dapat diinput kembali. \nNilai Kuis Ke -" + nilaiKuis + ":");
                    inputNilai = in.nextDouble();
                }

            /*
            if (inputNilai<0 && inputNilai>100){
                System.out.println("Mohon dapat menginput kembali");
                return;
            }
            else {


                //System.out.println("===================================");
                //System.out.println("Nilai Rata - Rata Kuis =" + averageNilai);


                /*
                System.out.print("Grade :");
                if (averageNilai<=80){
                    System.out.println("Grade A");
                }
                else if (averageNilai<80 && averageNilai>=70){
                    System.out.println("Grade B");
                }
                else if (averageNilai<70 && averageNilai>=50){
                    System.out.println("Grade C");
                }
                else {
                    System.out.println("Grade D");
                }
                */

                //}
            }
            System.out.println("===================================");
            System.out.println("Nama =" + inputNama);
            System.out.println("Kelas =" + inputKelas);
            System.out.println("Mata Pelajaran =" + listPelajaran[inputPelajaran - 1]);
            System.out.println("Grade :" + checkGrade(averageNilai));
            verifyRestart();
        }
    }
    public static boolean verifyRestart() {
        Scanner in = new Scanner(System.in);
        System.out.println("Apakah anda ingin mengulangi? Y/N");
        loopInput = in.nextLine();
        return "y".equalsIgnoreCase(loopInput);
    }


    public static void printListPelajaran() {

        for (int a = 1; a <= listPelajaran.length; a++) {
            System.out.println(a + "." + listPelajaran[a - 1]);
        }
    }

    public static String checkGrade(double val) {
        if (val >= 80) {
            return "Grade A";
        } else if (val < 80 && val >= 70) {
            return "Grade B";
        } else if (val < 70 && val >= 50) {
            return "Grade C";
        } else {
            return "Grade D";
        }
    }

}

