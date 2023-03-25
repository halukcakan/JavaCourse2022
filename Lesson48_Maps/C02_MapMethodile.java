package Lesson48_Maps;

import java.util.List;
import java.util.Map;

public class C02_MapMethodile {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap= ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);


        //  value'lari sira numarali olarak yazdirin

        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

        //  isim ve soyisimlerin bir arada olacagi bir liste olustur

        List<String> sinifIsimSoyisimList= ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("Isim soyisim listesi : "+sinifIsimSoyisimList);

    }


}
