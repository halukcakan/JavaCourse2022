package Lesson49_Maps;

import Lesson48_Maps.ReusableMethods;

import java.util.Map;

public class C01_dununTekrari {
    public static void main(String[] args) {

        Map <Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        //  ogrenci listesini isim soyisim olarak yazdirin

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);


        //  kac farkli brans varsa  bransIsmi = branstakiOgrenciSoyismi seklinde yazdirin
        ReusableMethods.bransOgrenciSayisiYazdir (sinifListMap);


    }
}
