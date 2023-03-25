package Lesson26_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_arrayden_listYapmak {
    public static void main(String[] args) {

        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olustur
        kullanicidan bir tamsayi iste
        listede var olup olmadigini yaz
         */


        Random rnd = new Random();
        int sayi = 0;
        List <Integer> sayiListesi = new ArrayList<>();


        while (sayiListesi.size()<=200){

            sayi=rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }

        }

        System.out.println(sayiListesi);

        boolean bilemediMi = true;
        int tahminSayisi =1;
        Scanner scan = new Scanner(System.in);

        while (bilemediMi){     // bildiMi == false

            System.out.println("Lutfen bir sayi giriniz : ");
            sayi = scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("Tebriler "+tahminSayisi+" adet tahminden listeden bir sayi bildiniz.");

                bilemediMi=false;


            } else tahminSayisi++;


        }

    }
}
