package Lesson19_NestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {


        /*
        kullanicidan bir sifre isteyin
        - ilk harf buyuk olmali
        - son harf kucuk olmali
        - en az sekiz karakter icermeli
        - bosluk icermemeli
        denedikten sonra sifre yanlis ise tekrar denettir
         */






        Scanner scan = new Scanner(System.in);
        boolean girilenSifreYanlisMi = true;

        int kontrol = 0;



        while (girilenSifreYanlisMi) {      //  while'in calismaya devami icin sart true olmali

            //kullanicidan sifre alalim
            System.out.println("Lutfen bir sifre giriniz : ");
            String girilenSifre = scan.next();

            //ilk harf kontrolu
            if ((girilenSifre.charAt(0) >= 'A' && girilenSifre.charAt(0) <= 'Z')) {
                kontrol++;
            } else System.out.println("Ilk harfi buyuk olmalidir");

            //son harf kontrolu
            if ((girilenSifre.charAt(girilenSifre.length() - 1) >= 'a') &&
                    (girilenSifre.charAt(girilenSifre.length() - 1) <= 'z')) {
                kontrol++;
            } else System.out.println("Son harf kucuk olmalidir");

            //karakter miktari kontrolu
            if (girilenSifre.length() >= 8) {
                kontrol++;
            } else System.out.println("En az 8 harf giriniz");

            //space kontrolu
            if (girilenSifre.contains(" ")) {
                System.out.println("Sifre bosluk olmamalidir");
            } else {
                kontrol++;
            }


            // SONUC
            if (kontrol == 4) {
                System.out.println("Sifre basari ile tanimlandi");
                girilenSifreYanlisMi = false;
            } else {
                kontrol=0;                  //  KONTROL SIFIR OLMALI CUNKU TEKRAR BASA DONUYOR
                System.out.println("Islem basarisiz, lutfen tekrar deneyiniz");
            }

        }





    }
}
