package Lesson22_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {


        int sayilar [] = new int [3];

        System.out.println(sayilar);    //  [I@3b6eb2ec

        //  referans yerini yazdirdi

        System.out.println(Arrays.toString(sayilar));   //  [0, 0, 0]

        sayilar[2]=10;
        sayilar[0]=8;

        System.out.println(Arrays.toString(sayilar));

        String sinifList [] = {"Ali", "Ayse", "Mehmet"};
        System.out.println(Arrays.toString(sinifList));     //  [Ali, Ayse, Mehmet]

        sinifList[1]= "Hasan";      //   uc erkekle yola devam

        System.out.println(sinifList[1]);       //  Hasan   [array degil string]




    }
}
