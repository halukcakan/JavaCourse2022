package Lesson20_While_DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan tam sailar alin
        kullanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitin

         */

        Scanner scan = new Scanner(System.in);

        int sayi = 0;

        /*

        while (sayi%2==0){

            System.out.println("Lutfen sayi giriniz : ");
            input = scan.nextInt();

        }

        */

        //  DO-WHILE DA ONCEDEN HANGI DEGERIN ATANDIGININ HICBIR ONEMI YOK
        //  FAKAT
        //  ILK ISLEM DIKKATLE KONTROL EDILMELI

        do{
            System.out.println("Lutfen sayi giriniz : ");
            sayi = scan.nextInt();

        }while (sayi%2==0);




    }
}
