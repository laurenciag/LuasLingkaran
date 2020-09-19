public class Latihan5 {

    int jumlah;

abstract class senjata{
    abstract void jumlahPeluru();

}

class pistol extends senjata{

    @Override
    void jumlahPeluru() {System.out.println("Jumlah peluru :"+jumlah);

    }
}

class automaticRifle extends senjata{

    @Override
    void jumlahPeluru() {

    }
}

class shotgun extends senjata{

    @Override
    void jumlahPeluru() {

    }
}

class smg extends senjata{

    @Override
    void jumlahPeluru() {

    }
}
public static void main(String[] args) {

}
}
