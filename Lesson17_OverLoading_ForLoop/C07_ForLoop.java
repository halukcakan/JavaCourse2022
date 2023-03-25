package Lesson17_OverLoading_ForLoop;

public class C07_ForLoop {
    public static void main(String[] args) {


        /*
        input un faktoriyelini yazdiran bir method olusturun

        sayi negatif veya 20den buyuk ise
        "...." yazdirin
         */

        int input = 5;

        faktoriyel(input);


    }

    public static void faktoriyel(int input) {

        int sonuc = 1;

        if (input<0 || input>20){
            System.out.println("Verilen sayi icin faktoriyel hesaplanamaz");
        } else if (input==0) {
            System.out.println("0! = 1 dir");
        } else {

            for (int i = 1; i < input; i++) {
                sonuc *= i;
            }
            System.out.println("Faktoriyel degeri : " + sonuc);
        }
    }
}
