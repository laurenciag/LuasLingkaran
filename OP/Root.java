package OP;

public class Root {

    public static void main (String[] a){

        System.out.println("\nProgram Testing Class Manager & Staff\n");
        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        //manager
        man[0] = new Manager();
        man[0].setNama("Hendra Sumanto");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(500000);
        man[0].setBagian("Administrasi");

        man[1] = new Manager();
        man[1].setNama("Atik Belatik");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(250000);
        man[1].setBagian("Pemasaran");

        //Staff
        staff1[0] = new Staff();
        staff1[0].setNama("Doni");
        staff1[0].setNip("103");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(15);
        staff1[0].setGajiLembur(10000);

        staff1[1] = new Staff();
        staff1[1].setNama("Laura");
        staff1[1].setNip("104");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(25);
        staff1[1].setGajiLembur(18000);
        man[0].setSt(staff1);

        //Staff 2
        staff2[0] = new Staff();
        staff2[0].setNama("Dodi");
        staff2[0].setNip("105");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(10);
        staff2[0].setGajiLembur(550000);

        staff2[1] = new Staff();
        staff2[1].setNama("Dara");
        staff2[1].setNip("106");
        staff2[1].setGolongan("3");
        staff2[1].setLembur(10);
        staff2[1].setGajiLembur(800000);

        staff2[2] = new Staff();
        staff2[2].setNama("Hendry");
        staff2[2].setNip("107");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(10);
        staff2[2].setGajiLembur(5500000);
        man[1].setSt(staff2);

        man[0].lihatInfo();
        man[1].lihatInfo();
    }
}
