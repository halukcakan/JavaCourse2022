package Lesson24_Multi_Dimensional_Arrays;

import java.util.ArrayList;
import java.util.List;

public class C06_list {
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);

        System.out.println(sayilar);        //  [5, 3, 7]

        //  asagidaki add sil yeni eleman ekle yapmaz sirayi kaydirir ve yeni elemani ekler
        sayilar.add(2,10);

        System.out.println(sayilar);        //  [5, 3, 10, 7]

    }
}
