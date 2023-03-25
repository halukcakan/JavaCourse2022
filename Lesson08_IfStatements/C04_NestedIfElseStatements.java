package Lesson08_IfStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {

        /*
        kullanicidan bir sifre isteyin
        eger ilk harf buyuk ise "A" olup olmadigini kontrol edin
                oyle ise 'gecerli sifre' degil ise 'gecersiz sifre'
        eger ilk harf kucuk "z' olup olmadigini kontrol et
                oyle ise 'gecerli sifre' degil ise 'gecersiz sifre'
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        char sifreninHarfi = scan.next().charAt(0);

        // ilk harf buyuk mu
        if (sifreninHarfi >= 'A' && sifreninHarfi <= 'Z') {
            if (sifreninHarfi == 'A') {
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("Gecersiz sifre");
            }


            // ilk harf kucuk mu
        } else if (sifreninHarfi >= 'a' && sifreninHarfi <= 'z') {
            if (sifreninHarfi == 'z') {
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("Gecersiz sifre");
            }


        } else {
            System.out.println("Lutfen ilk karakter icin harf kullanin");


        }
    }
}
