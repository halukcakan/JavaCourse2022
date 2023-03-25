package Lesson16_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreation_ReturnType {
    public static void main(String[] args) {

    /*
    sehir ismi ve dogum tarihini al
    bunlari projede kullancagimiz formatta bize donduren bir mothod olustur
    sehir ismi buyuk harf
    tarih ise 2022-06-03
     */

        String sehir = sehirAl();
        String tarih = tarihAl();

        System.out.println("Girdiginiz tarih : "+tarih);
        System.out.println("Girdiginiz sehir : "+sehir);


    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Yil giriniz : ");
        int yil = scan.nextInt();
        if (yil>1900 && yil<2100){
            tarih += yil + "-";
        } else System.out.println("Gecerli bir yil giriniz!");

        System.out.println("Ay giriniz : ");
        int ay = scan.nextInt();
        if (ay<0 || ay>12){
            System.out.println("Gecerli ay giriniz!");
        } else if (ay>0 && ay<10){
            tarih += "0"+ay+"-";
        } else tarih += ay+ "-";

        System.out.println("Gun giriniz : ");
        int gun = scan.nextInt();
        if (gun<0 || gun>31){
            System.out.println("Gecerli gun giriniz!");
        } else if (gun>0 && gun<10){
            tarih += "0"+gun;
        } else tarih += gun;

        return tarih;
    }

    public static String sehirAl() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sehir giriniz : ");
        String sehirAdi = scan.next().toUpperCase();

        return sehirAdi;
    }
}
