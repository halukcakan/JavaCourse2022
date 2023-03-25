package Lesson08_IfStatements;

import java.util.Scanner;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {


        //  65 yasinda erkekler icin ve 60 yasinda kadinlar icin emeklilik sorgulama


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Lutfen cinsiyetinizi yaziniz");
        String cinsiyet = scan.next().toLowerCase();


        if ((yas < 0 || yas > 90)) {
            System.out.println("Gecersiz yas girdiniz");
            // rakam yanlis

        } else if (!(cinsiyet.equals("kadin") || (cinsiyet.equals("erkek")))) {
            System.out.println("Gecersiz cinsiyet girdiniz");
            // cinsiyet yanlis

        } else if (yas < 60) {

            if (cinsiyet.equals("erkek")) {
                System.out.println("Emekli olmaniza " + (65 - yas) + " yil var");
            } else if (cinsiyet.equals("kadin")) {
                System.out.println("Emekli olmaniza " + (60 - yas) + " yil var");
            }
            // 60 tan kucuk durumu

        } else if (yas < 65) {

            if (cinsiyet.equals("erkek")) {
                System.out.println("Emekli olmaniza " + (65 - yas) + " yil var");
            } else if (cinsiyet.equals("kadin")) {
                System.out.println("Emekli olabilirsiniz");
            }
            // 65 ten kucuk durumu

        } else if (yas > 65) {

            System.out.println("Emekli olabilirsiniz");

        }   // 65 ten buyuk durumu

                /*

                ONCE ANA SENARYOYU BELIRLE
                ARDINDAN NESTED YAPILACAK DURUMLARI IF KOMUTLARININ ARA SATIRLARINA YAZ

                 */






    }
}
