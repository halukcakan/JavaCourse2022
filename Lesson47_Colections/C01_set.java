package Lesson47_Colections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_set {
    public static void main(String[] args) {

        int[] arr = {3, 6, 3, 246, 7, 5, 7, 6, 4, 5, 223, 68, 678, 90, 0};

        Set<Integer> tekrarsizSet = new HashSet<>();

        for (int each : arr
        ) {
            tekrarsizSet.add(each);
        }

        System.out.println(tekrarsizSet);

        int tekrarsizArr[] = new int[tekrarsizSet.size()];

        System.out.println(Arrays.toString(tekrarsizArr));      //  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int i = 0;
        for (int each : tekrarsizSet
        ) {
            tekrarsizArr[i]=each;
            i++;
        }

        arr= tekrarsizArr;


        System.out.println(Arrays.toString(arr));      //  [0, 3, 4, 68, 5, 6, 246, 678, 7, 90, 223]


    }
}
