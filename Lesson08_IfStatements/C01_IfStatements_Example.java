package Lesson08_IfStatements;

import java.util.Scanner;

public class C01_IfStatements_Example {
    public static void main(String[] args) {

        /*
        kullanicidan bir gun ismi iste
        isim gecerli ise 1. 2. ve 3. harlerin birinciyi buyuk harf ikinciyi kucuk harf olarak yazdir
        isim gecerli degil ise "..." yazdir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz ");
        String gun= scan.next().toLowerCase();      // once hepsini kucuk harf yaptik

        if (gun.equals("pazartesi")){
            System.out.println("Paz");
        } else if (gun.equals("sali")){
            System.out.println("Sal");
        } else if (gun.equals("carsamba")) {
            System.out.println("Car");
        } else if (gun.equals("persembe")) {
            System.out.println("Per");
        }else if (gun.equals("cuma")){
            System.out.println("Cum");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Cum");
        } else if (gun.equals("pazar")) {
            System.out.println("Paz");
        } else System.out.println("Gecersiz gun ismi");


    }
}
