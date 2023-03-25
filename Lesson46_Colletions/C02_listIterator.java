package Lesson46_Colletions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_listIterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println(liste);

        /*
        sondan basa gelebilmek icin once sona gitmesi gerek [iterator]
         */

        ListIterator lt1 = liste.listIterator();

        while (lt1.hasNext()){
            lt1.next();
        }

        while (lt1.hasPrevious()){
            System.out.print(lt1.previous()+" ");
        }
    }
}
