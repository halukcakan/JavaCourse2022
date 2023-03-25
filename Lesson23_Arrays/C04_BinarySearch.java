package Lesson23_Arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        /*
        binary search javada eleman aramanin kisa yoludur
        ancak binary search calismasi icin once
        array'in sirlai hale getirilmesi gerekir
         */

        String [] harfler = {"Y","G","Q","P"};

        String arananHarf = "Y";



        System.out.println(Arrays.binarySearch(harfler,arananHarf));

        //  binary search bize aradimiz elemanin index'ini dondurur

        Arrays.sort(harfler);

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        // sort'tan sonra arananin dogru index numarasi ile buldu fakat
        // sira degistigi icin yeni sirada nerede oldugunu yazdi




    }
}
