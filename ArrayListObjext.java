import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListObjext {
    public static void  main(String[] args) {

        ArrayList<Siswa> arraySiswa = new ArrayList<Siswa>();

        arraySiswa.add(new Siswa("ABP","A02","230",100));
        arraySiswa.add(new Siswa("HTA","A03","210",90));
        arraySiswa.add(new Siswa("FSL","A05","220",95));

        Comparator c = Collections.reverseOrder();
        Collections.reverse(arraySiswa);


        //Arrays.sort(Siswa, Collections.reverseOrder());
        for (int a = 0; a < arraySiswa.size(); a++){
            System.out.println("Nama :"+arraySiswa.get(a).getNama());
            System.out.println("Kelas :"+arraySiswa.get(a).getKelas());
            System.out.println("Nomor Induk :"+arraySiswa.get(a).getNoInduk());
            System.out.println("Nilai :"+arraySiswa.get(a).getNilai());

        }
    }
}
