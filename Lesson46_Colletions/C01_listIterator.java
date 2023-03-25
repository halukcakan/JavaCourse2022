package Lesson46_Colletions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_listIterator {
    public static void main(String[] args) {

        /*
        bir listedeki istenen sayi araliginda olmayan elementleri silen program yaziniz
         */

        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println(liste);          //  [2, 13, 56, 23, 45, 14, 40]

        ListIterator lt1 = liste.listIterator();
        int bas = 20;
        int bit = 40;



        while (lt1.hasNext()){

            int temp= (Integer) lt1.next();     //  object'i < veya > yapamadigimiz icin int yapip atadik

            if (temp<bas || temp>bit){
                lt1.remove();
            }
        }

        System.out.println(liste);          //  [23, 40]


    }
}
