package OP;

abstract class Binatang {
    protected abstract void tampilSuara();
}

class Anjing extends Binatang{
    @Override
    protected void tampilSuara() {
        System.out.println("Suara Dog: gukguk");
    }
    }


public class OOP1 {
    public static void  main(String args[]){
        Binatang dog = new Anjing();
        dog.tampilSuara();
    }
}
