package Lesson03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi \naralarda Enter tusuna basarak giriniz");

        String isim= scan.nextLine();;
        String soyIsim = scan.nextLine();
        int yas = scan.nextInt();

        System.out.println(isim +" "+soyIsim+" "+yas);


    }
}
