package Lesson18_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*
        kullanicidan iki sayi isteyiniz
        girilen sayilar ve aralarindaki sayilari toplayip yazdiran
        bir method yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int ilkSayi = scan.nextInt();
        System.out.println("Lutfen bir sayi giriniz : ");
        int ikinciSayi = scan.nextInt();

        aralarinToplami(ilkSayi, ikinciSayi);


    }

    public static void aralarinToplami(int ilkSayi, int ikinciSayi) {
        int sonuc = 0;
        if (ikinciSayi > ilkSayi) {
            for (int i = ilkSayi; i <= ikinciSayi; i++) {
                sonuc += i;
            }

        } else {
            for (int i = ikinciSayi; i <= ilkSayi; i++) {
                sonuc += i;
            }

        }
        System.out.println(sonuc);


    }
}
