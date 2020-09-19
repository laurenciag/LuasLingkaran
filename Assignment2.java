import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        String nama;
        Scanner in = new Scanner(System.in);
        StringBuilder out = new StringBuilder();

//        nama = in.nextLine();
        String[][] as = new String[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Siapa yang akan duduk di kelas (" + i + "," + (j + 1) + ") : ");
                as[i][j] = in.nextLine();
                out.append("     ").append(as[i][j]);
            }
            out.append("\n");
            System.out.println("\n");
        }
        System.out.println("output :");
        System.out.println("==================================");
        System.out.println(out);
        System.out.println("==================================");

    }

}


