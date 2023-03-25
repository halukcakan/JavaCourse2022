package Lesson13_Recap_01;

import java.util.Scanner;

public class C01_Example_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Isminiz :");
        String isim = scan.nextLine();

        System.out.print("Memleketiniz :");
        String memleket = scan.nextLine();

        System.out.print("Konumunuz :");
        String konum = scan.nextLine();

        System.out.print("Yas :");
        int yas = scan.nextInt();

        System.out.print("Boy :");
        double boy = scan.nextDouble();

        System.out.print("Yasadiginiz "+konum+ "u seviyor musunuz?  (true?false) ");
        boolean seviyorMu = scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);









    }
}
