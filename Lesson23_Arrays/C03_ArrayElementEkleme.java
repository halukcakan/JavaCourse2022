package Lesson23_Arrays;

import java.util.Arrays;

public class C03_ArrayElementEkleme {
    public static void main(String[] args) {

        String [] sinifListesi = {"Ali Can","Nida Yucedal"};
        String eklenecekIsim = "Murat Babayigit";


        sinifListesi = elemanEkle(sinifListesi,eklenecekIsim);

        System.out.println(Arrays.toString(sinifListesi));

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        String [] yeniSinifListesi = new String[sinifListesi.length+1];

        for (int i = 0; i < sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
        }

        yeniSinifListesi [yeniSinifListesi.length-1]= eklenecekIsim;

        return yeniSinifListesi;

    }
}
