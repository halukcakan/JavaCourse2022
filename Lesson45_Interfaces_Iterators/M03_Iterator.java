package Lesson45_Interfaces_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);

        for (Integer each: liste
             ) {
            System.out.print(each+3+" ");
        }

        System.out.println("");
        System.out.println(liste);          // kalici olarak degismedi each, loop icerisinde basladi bitti


        Iterator it1 = liste.iterator();

        System.out.println(it1.next());         //  10
        System.out.println(it1.next());         //  20
        System.out.println(it1.next());         //  30
        //  System.out.println(it1.next());     //  RTE


        Iterator it2 = liste.iterator();

        it2.next(); it2.remove();               //  uzerinden atladi ve sildi
        System.out.println(liste);              //  [20, 30]
        it2.next(); it2.remove();
        it2.next(); it2.remove();



        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("Loop'tan once Liste : "+liste);

        Iterator it3 = liste.iterator();

        while (it3.hasNext()){
            it3.next(); it3.remove();
        }
        System.out.println("Loop'tan sonra Liste : "+liste);


    }
}
