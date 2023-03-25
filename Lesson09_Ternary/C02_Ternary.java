package Lesson09_Ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        /*
        sayi al
        sayi pozitif ise "pozitif sayi yazdir"
        sayi negatif ise sayinin karesini yazdir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();


        // ternary icindeki sonuclar farkli data turunde ise atama yapamaz sadece yazdirabiliriz


        System.out.println( sayi>0 ? "Sayi pozitif" : (sayi*sayi) );    // atama yapazsin direk yazdirmalisin
        // cunku bir body String bir body int

        // sout un icerisine bir daha sout ne alaka  AT TIRNAGI gec
        // sout ( sayi>0 ? sout( "sayi pozitif") : (sayi*sayi)    )




    }
}
