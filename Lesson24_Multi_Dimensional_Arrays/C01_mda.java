package Lesson24_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class C01_mda {
    public static void main(String[] args) {


        // tek katmanli arrayler direk yazdirilamaz

        /*
        DIKKAT
        multi-dimensional arraylerde ulasmak istedigimiz elementin array mi yoksa primitive data mi ?
         */

        int [][] sayilar = {{1,2,4,5},{3,4}};

        /*
        sayilar array'in icerisinde iki tane inner array var
        sayilar[0] ==> [1,2,4,5]


         */

        System.out.println(sayilar[0]);     //  [I@3b6eb2ec
        System.out.println(Arrays.toString(sayilar[0]));    //  [1, 2, 4, 5]
        System.out.println(sayilar[0][1]);      //  2


        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.deepToString(sayilar));

    }






}
