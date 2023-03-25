package Lesson15_MethodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {

        /*
        kullanicidan bir sifre isteyin
        - ilk harf buyuk olmali
        - son harf kucuk olmali
        - en az sekiz karakter icermeli
        - bosluk icermemeli
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz : ");
        String girilenSifre = scan.next();

        int kontrol = 0;

        //ilk harf kontrolu
        if ((girilenSifre.charAt(0)>='A' && girilenSifre.charAt(0)<='Z') ){
            kontrol++;
        } else System.out.println("Ilk harfi buyuk olmalidir");

        //son harf kontrolu
        if ((girilenSifre.charAt(girilenSifre.length()-1)>= 'a') &&
                (girilenSifre.charAt(girilenSifre.length()-1)<= 'z')){
            kontrol++;
        } else System.out.println("Son harf kucuk olmalidir");

        //karakter miktari kontrolu
        if (girilenSifre.length()>=8){
            kontrol++;
        } else System.out.println("En az 8 harf giriniz");

        //space kontrolu
        if (girilenSifre.contains(" ")){
            System.out.println("Sifre bosluk olmamalidir");
        } else {
            kontrol++;
        }

        // SONUC
        if (kontrol == 4) {
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz, lutfen tekrar deneyiniz");
        }










    }
}
