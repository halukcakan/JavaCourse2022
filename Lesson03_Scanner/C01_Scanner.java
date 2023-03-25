package Lesson03_Scanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // kullanicidan ismini isteyin ve gosterin

        Scanner scan = new Scanner(System.in);

        System.out.println("Isminizi giriniz");

        String kullaniciIsmi= scan.next();

        System.out.println("Isminiz: "+ kullaniciIsmi);


    }
}
