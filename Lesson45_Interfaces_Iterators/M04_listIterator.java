package Lesson45_Interfaces_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_listIterator {

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(100);
        liste.add(200);
        liste.add(300);

        System.out.println(liste);

        Integer temp;

        ListIterator lt1 = liste.listIterator();

        while (lt1.hasNext()){
            temp=(Integer) lt1.next()+3;

            lt1.set(temp);
        }
        System.out.println(liste);

    }

}
