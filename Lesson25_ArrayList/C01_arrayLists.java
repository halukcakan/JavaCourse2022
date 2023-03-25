package Lesson25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_arrayLists {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        sayilar1.size();

        System.out.println(sayilar1.size());        //  3

        sayilar1.add(2);

        System.out.println(sayilar1.size());        //  4


        sayilar1.set(1,9);
        System.out.println(sayilar1);       //  [5, 9, 2, 2]


        System.out.println(sayilar1.set(0,0));      //  DIKKAT: set edilmeden onceki eski elementi yazdirir
    }
}
