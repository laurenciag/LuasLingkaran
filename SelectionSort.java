import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah Data : ");
        int jlh_data = scan.nextInt();
        int[] data = new int[jlh_data];

        for (int x = 0; x < data.length; x++){
            System.out.print("Input nilai Data ke - " + (x + 1) + ": ");
            data[x] = scan.nextInt();
        }

        int[] sortedData = doSelectionSort(data);

        System.out.println("Data setelah di sorting : ");
        for (int x = 0; x < sortedData.length; x++){
            System.out.print(data[x] + " ");
        }
    }

    public static int[] doSelectionSort(int[] data){

        System.out.println();
        for (int x = 0; x < data.length -1; x++){
            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "Tidak ada pertukaran";
            for (int y = x + 1; y < data.length; y++){
                if (min > data[y]){
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }
            if (tukar == true){
                pesan = "Angka" + data[x] + " ditukar";
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }
}
