package Lesson25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_contains {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Ati");
        isimler.add("Ciki");
        isimler.add("Haluk");
        isimler.add("Ozlem");

        System.out.println(isimler.contains("Ati"));        //  CONTAINS

        List<String> it = new ArrayList<>();

        it.add("Ati");


        System.out.println(isimler.containsAll(it));        //  CONTAINSALL


    }
}
