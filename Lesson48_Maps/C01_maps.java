package Lesson48_Maps;

import java.util.*;

public class C01_maps {
    public static void main(String[] args) {

        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, Java");
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);      //      {101=Ali, Can, JDev, 102=Enes, Cem, ...

        System.out.println(sinifList.keySet());     //  [101, 102, 103, 104]
        System.out.println(sinifList.values());     //  [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, Java, Derya, Deniz, Tester]

        System.out.println(sinifList.values().size());

        //  tum ogrencilerin isimlerini ve soyisimlerini sira no ile alt alta yazdirin

        Collection<String> tumValueColl = sinifList.values();

        String[] eachArr;
        int sira =1;

        for (String each: tumValueColl
             ) {
            // buradaki each bize her bir ogrenciye ait isim ve soyisimlerini iceren String getirir
            eachArr= each.split(", ");
            System.out.println(sira+"- "+eachArr[0]+" "+eachArr[1]);
            sira++;
        }


        /*
        isim ve soyisimleri birlestirerek
        bir sinif listesi olusturun
         */

        List<String> sinifIsimSoyisimListesi = new ArrayList<>();

        for (String each:tumValueColl
             ) {

            eachArr=each.split(", ");
            sinifIsimSoyisimListesi.add(eachArr[0]+" "+eachArr[1]);

        }

        System.out.println(sinifIsimSoyisimListesi);

    }
}
