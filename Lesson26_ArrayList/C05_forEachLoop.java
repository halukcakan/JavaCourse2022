package Lesson26_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_forEachLoop {
    public static void main(String[] args) {

        int arr[] = {3, 3, 46, 45, 34, 56, 6, 7, 34, 2, 246, 457, 5, 33, 2, 4, 56, 76, 3, 2, 45, 6, 2};

        List<Integer> liste = new ArrayList<>();

        // array'deki tum elemanlari inceleyip, tek sayi olanlari list'e atayalim


        for (int each : arr
        ) {

            if (each % 2 == 1) {
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
