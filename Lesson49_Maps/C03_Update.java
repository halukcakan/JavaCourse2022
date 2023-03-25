package Lesson49_Maps;

import Lesson48_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C03_Update {

    public static void main(String[] args) {

        // verilen map'te JDev degerlerini JavaDeveloper olarak degistirelim


        Map <Integer,String> sinifListesiMap = ReusableMethods.mapOlustur();


        Set<Integer> keySeti = sinifListesiMap.keySet();
        // her bir key'i yeni set'e atadi
        String eachValue;

        for (Integer each:keySeti
             ) {
            eachValue= sinifListesiMap.get(each);
            //  set'teki [her bir key'e ait olan] value'larini tek parca aldi     [101]   ve atadi

            eachValue= eachValue.replace("JDev","JavaDeveloper");
            // String olarak atanan her key'in value degerinde istenenleri hedeflenen ile degistirdi

            sinifListesiMap.put(each,eachValue);
            // key'e value'yu atadi
        }

        System.out.println(sinifListesiMap);
    }


}
