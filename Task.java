import java.util.*;

public class Task {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] angs){

        String inputNama, inputKelas, inputNomor;
        int inputNilai;
        inputSiswa [] inputSiswa = new inputSiswa[5];

        System.out.println("=====================================");
        System.out.println("Aplikasi Input Nilai Siswa");
        System.out.println("=====================================");

        for (int i = 0; i<inputSiswa.length; i++){
            System.out.println("Siswa ke -"+(i+1));
            System.out.print("Masukan Nama :");
            inputNama = in.nextLine();

            System.out.print("Masukan Kelas :");
            inputKelas = in.nextLine();

            System.out.print("Masukan Nomor :");
            inputNomor = in.nextLine();

            System.out.print("Masukan Nilai :");
            inputNilai = in.nextInt();

            while (inputNilai<0 || inputNilai>100) {
                System.out.print("Nilai yang Anda masukan tidak sesuai, Mohon dapat dicoba kembali\nMasukan Nilai :");
                inputNilai = in.nextInt();
            }

            inputSiswa[i] = new inputSiswa(inputNama, inputKelas, inputNomor, inputNilai);
            in.nextLine();
            System.out.println();
        }

        Arrays.sort(inputSiswa, Collections.reverseOrder());
        for (int a=0; a<inputSiswa.length; a++){
            System.out.println((a+1)+". "+ inputSiswa[a].inputNama+" "+inputSiswa[a].inputKelas+" "+inputSiswa[a].inputNomor+" "+inputSiswa[a].inputNilai);
        }
    }
    public static class inputSiswa implements Comparable<inputSiswa>{
        public String inputNama, inputKelas, inputNomor;
        public int inputNilai;

        public inputSiswa(String inputNama,String inputKelas,String inputNomor, int inputNilai){
            this.inputNama = inputNama;
            this.inputKelas = inputKelas;
            this.inputNomor = inputNomor;
            this.inputNilai = inputNilai;
        }

        @Override
        public int compareTo(inputSiswa o) {
            return this.inputNilai - o.inputNilai;
        }
    }
}
