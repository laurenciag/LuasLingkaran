package OP;

public class OOP3 {

        static double maxNumber(double a, double b){
            if (a > b){
                return a;
            }
            else {
                return b;
            }
        }

        static int maxNumber(int a, int b){
            if (a < b) {
                return a;
            }
            else {
                return b;
            }
        }

        static  int maxNumber(int a, int b, int c){
            if (a > b) {
                return c;
            }
            else {
                return b;
            }
        }

        static void maxNumber(int a, int b, int c, int d){
            if (a < b){
                System.out.println(c);
            }
            else {
                System.out.println(d);
            }
        }

        public static void main (String [] args){
            System.out.println(maxNumber(10,20));
            System.out.println(maxNumber(4.5,7.5));
            System.out.println(maxNumber(3,5,8));
            maxNumber(3,4,5,6);
        }

}

