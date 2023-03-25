package Lesson03_Scanner;

import java.util.Scanner;

public class C05_BuyukHarf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz :");

        String isim = scan.nextLine();

        char isminIlkHarfi = isim.toUpperCase().charAt(0);  // ilk harfi buyuk harfe cevirdi
        char isminIkinciHarfi = isim.toLowerCase().charAt(1);  // ikinci harfi kucuk harfe cevirdi


        /*
                1) variable char olarak ata
                2) toUpperCase kucuk harfi buyuk harf yapar
         */

        System.out.println("Isminizin ilk buyuk harfi :" + isminIlkHarfi);
        System.out.println("Isminizin ikinci kucuk harfi :" + isminIkinciHarfi);



    }
}
