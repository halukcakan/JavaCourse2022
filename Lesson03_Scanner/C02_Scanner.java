package Lesson03_Scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Carpilacak sayilardan ilkini giriniz :");
        double ilkSayi = scan.nextDouble();

            /*
            bu ornekteki gibi bazi sorularda int yerine double kullanmak daha iyi
             */

        System.out.println("Carpilacak sayilardan ikinciyi giriniz :");
        double ikinciSayi = scan.nextDouble();

        System.out.println("Sayilarin carpimi : "+ (ilkSayi*ikinciSayi));


    }
}
