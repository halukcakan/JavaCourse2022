package Lesson47_Colections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_collections_dataTuru {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        /*
        list1.add(5);
        list1.add('a');
        list1.add(true);
         */

        List list2 = new ArrayList();      //  List <Object> list2 = new ArrayList();
        list2.add(5);
        list2.add('a');
        list2.add(true);
        list2.add("Ali");


        Set list3 = new HashSet<>();

        // casting yapmak zorunda kalinilabilir


    }
}
