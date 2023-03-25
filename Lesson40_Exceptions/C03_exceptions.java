package Lesson40_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_exceptions {
    public static void main(String[] args) {

        /*
        marketteki tum urunleri bir array'de tutugumuzu varsayalim
        Kullaniciya indes sorup, o indexteki urunu yazdiran program hazirlayalim
        kullanici urun sayisindan buyuk bir index girerse
        exception vermesinin onune gecelim
         */

        String [] urunler = {"Nutella","Sut","Cay"};


        Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz urunun nosunu girin");

        int istenenSira=0;

        try {
             istenenSira = scan.nextInt();
        } catch (InputMismatchException deneme) {

        }

        try {
            System.out.println("Aradiginiz urun : "+urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiniz sira listemizde bulunmuyor"+
                    "\nSira numarasi en fazla : "+(urunler.length)+ " olabilir");
        }


    }
}
