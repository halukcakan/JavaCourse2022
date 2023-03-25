package Lesson49_Maps;

import Lesson48_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

        Map<Integer,String> sinifListesiMap = ReusableMethods.mapOlustur();


        // map'in her bir elemanini alt alta yazdirin       101=Ali, Can, JDev

        Set<Map.Entry<Integer,String>> sinifEntrySet = sinifListesiMap.entrySet();

        for (Map.Entry<Integer,String> each: sinifEntrySet
             ) {
            System.out.println(each);
        }



        // map'in tum elemanlari icerisinde Tester varsa QA olarak degistirelim ve tekrar Map olsun

        String eachValue;
        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }

        System.out.println(sinifListesiMap);

    }
}
