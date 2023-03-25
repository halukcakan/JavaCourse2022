package Lesson23_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_ArrayOlustur {
    public static void main(String[] args) {

        /*
        kullanicidan bir array'in
        boyutunu ve tum elementlerini alarak bir array olustur
        bu array'i bize donduren bir method olustur
         */

        int [] sayilar = arrayOlustur();

        System.out.println(Arrays.toString(sayilar));

    }

    public static int[] arrayOlustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elementli bir array olusturmasini istersiniz");
        int uzunluk= scan.nextInt();

        int [] olusturulan = new int [uzunluk];

        for (int i = 0; i < uzunluk ; i++) {

            System.out.println(i+". index icin sayi giriniz");
            olusturulan [i] = scan.nextInt();


        }

        return olusturulan;



    }
}
