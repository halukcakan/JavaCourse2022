package Lesson22_Arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {

        //  iki sekilde array olusturabiliriz

        int sayilar [] = {1,2,3};

        String harfler []= new String [4];

        System.out.println(sayilar.length);
        //  String lenght methodunda parantez var array de yok
        //  isim.length()

        System.out.println(Arrays.toString(harfler));   //  [null, null, null, null]



    }
}
