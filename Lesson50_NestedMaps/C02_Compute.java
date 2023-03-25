package Lesson50_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_Compute {
    public static void main(String[] args) {

        Map<String,Integer> harfMapi = new HashMap<>();

        harfMapi.put("A",5);
        harfMapi.put("B",3);
        harfMapi.put("C",4);
        harfMapi.put("D",1);
        harfMapi.put("E",2);

        System.out.println(harfMapi);

        harfMapi.compute("A",(k,v) -> v*2);

        System.out.println(harfMapi);



        harfMapi.compute("E",(a,b) -> b*b);

        System.out.println(harfMapi);


        harfMapi.computeIfAbsent("C", (v) -> 30);

        System.out.println(harfMapi);


        harfMapi.computeIfAbsent("D", (v) -> 100);

        System.out.println(harfMapi);


        harfMapi.computeIfPresent("C", (k,v) -> v+5);

        System.out.println(harfMapi);
    }
}
