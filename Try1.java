
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Try1 {

    static String[] listName = {"ABP", "DRA", "FSL", "HTA", "LGD"};
    static String[] listKelas = {"A001", "A002", "A003", "A004", "A005"};
    static String[] listNoInduk = {"001", "002", "003", "004", "005"};
    //static listNilai[] listNilai = new listNilai[5];
    static Integer[] listNilai = new Integer[]{

            new Integer(75),
            new Integer(80),
            new Integer(65),
            new Integer(90),
            new Integer(85)
    };



    public static void main(String[] angs) {
        Scanner in = new Scanner(System.in);

        String inputName;
        int inputNilai;

        System.out.println("========================================================");
        System.out.println("Aplikasi Input Nilai Siswa");
        System.out.println("========================================================");


        Arrays.sort(listNilai, Collections.reverseOrder());
        for (int a = 0; a < listNilai.length; a++){
            System.out.println((a+1)+". "+listName[a]+" "+listKelas[a]+" "+listNoInduk[a]+" "+listNilai[a]);
        }

        System.out.println("========================================================");
        //System.out.println(listNilai[i]);
        //Arrays.sort(listNilai, Collections.reverseOrder());

    }
}
