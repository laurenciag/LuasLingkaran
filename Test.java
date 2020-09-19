

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Siswa [] siswa = new Siswa [5];
        int nilai;
        System.out.println("Aplikasi Input Data Siswa");
        System.out.println("==========================");

        String nama, kelas, noInduk;

        for (int a=0; a<5; a++){
            System.out.println("Siswa ke-"+(a+1));
            System.out.print("Nama      : ");
            nama = in.nextLine();
            System.out.print("Kelas     : ");
            kelas = in.nextLine();
            System.out.print("No. Induk : ");
            noInduk = in.nextLine();
            System.out.print("Nilai     : ");
            nilai = in.nextInt();

            siswa[a] = new Siswa(nama, kelas, noInduk,nilai);
            in.nextLine();
            System.out.println();
        }

        Arrays.sort(siswa, Collections.reverseOrder());

        for(int b=0; b<5; b++){
            System.out.println((b+1)+". "+siswa[b].nama+" "+siswa[b].kelas+" "+siswa[b].noInduk+" "+siswa[b].nilai);
        }



    }

    public static class Siswa implements Comparable<Siswa>{
        public String nama, kelas, noInduk;
        public int nilai;

        public Siswa(String nama, String kelas, String noInduk, int nilai) {
            this.nama = nama;
            this.kelas = kelas;
            this.noInduk = noInduk;
            this.nilai = nilai;
        }

        @Override
        public int compareTo(Siswa o) {
            return this.nilai - o.nilai;
        }
    }

}

