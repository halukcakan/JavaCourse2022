package Lesson49_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {

    public static void main(String[] args) {

        /*
        verilen bir string'deki kullanilan harfleri ve kullanilan harflerin tekrar sayisini
        H = 20 seklinde yazdirin
        NOT: space ve harfleri saymasin
         */

        String str = "Heeeeellllloooo Woooorrrllllllddddddddd";

        str=str.replaceAll("\\W","");

        String [] harflerArr = str.split("");
        // her bir harfi teker teker ayirarak yeni bir array'e atadi

        Map<String,Integer> harfKullanimSayilariMap = new TreeMap<>();
        Integer harfKullanimSayisi;

        for (String each:harflerArr
             ) {

            if (!harfKullanimSayilariMap.containsKey(each)){
                harfKullanimSayilariMap.put(each,1);

            } else {
                harfKullanimSayisi=harfKullanimSayilariMap.get(each);       //  kac tane old degerini aldik

                harfKullanimSayilariMap.put(each,++harfKullanimSayisi);
            }

        }

        System.out.println(harfKullanimSayilariMap);

    }
}
