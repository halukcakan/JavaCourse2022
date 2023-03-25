package Lesson05_Matematikselslemler;

import java.util.Scanner;

public class C02_RakamlarToplami {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli tamsayi giriniz");
        int sayi = scan.nextInt();

        // 4652

        int sayilarToplami = 0;
        int birlerBasamagi = 0;
        int girilenSayi = sayi;

        birlerBasamagi = sayi % 10; // 2
        sayi /= 10; // 465
        sayilarToplami += birlerBasamagi; //2

        // 465

        birlerBasamagi = sayi % 10; // 5
        sayi /= 10; // 46
        sayilarToplami += birlerBasamagi;  // 7

        // 46

        birlerBasamagi = sayi % 10;  // 6
        sayi /= 10;  // 4
        sayilarToplami += birlerBasamagi;  // 14

        // 4

        birlerBasamagi = sayi%10;  // 4
        sayi /= 10;  // 0
        sayilarToplami += birlerBasamagi;  //  18

        System.out.println(girilenSayi +" sayisinin rakamlari toplami : "+ sayilarToplami);



    }
}
