package Lesson07_IfStatements;

import java.util.Scanner;

public class C04_IfStatementsExample {
    public static void main(String[] args) {

        /*
        kullanicidan bir karakter isterin ve bunun harf olum olmadigini kontrol edin
         */

        // bir karakter iste

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");
        char karakt = scan.next().charAt(0);

        if ((karakt>='a' && karakt<='z')||(karakt>='A' && karakt<='Z')){
            System.out.println("Girilen karakter bir harftir");
        } else {
            System.out.println("Girilen karakter harf degildir");
        }

        /*
        sayilarla degilde 'a' ile yaparsak o zaten otomatik a ile z arasinda mi diye kontrol eder
        cunku variable`i char atadik
         */


    }
}
