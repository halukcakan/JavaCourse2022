package Lesson25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_arrayList {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(11);

        System.out.println(sayilar1.size());

        sayilar1.remove(2);

        System.out.println(sayilar1);       //  [5, 3, 11]

        System.out.println(sayilar1.size());

        /*
        sayilardan olusan list varsa
        direk index olan degeri kabul eder
        fakat biz rakam olan elementi silmek istiyorsak
         */

        Integer sil = 5;
        sayilar1.remove(sil);
        System.out.println(sayilar1);       //  [3, 11]

        /*
                    YA      DA
         */

        sayilar1.remove(sayilar1.indexOf(3));       //  3un index'i bulup remove methodunda kullandi

        System.out.println(sayilar1);       //  [11]





    }
}
