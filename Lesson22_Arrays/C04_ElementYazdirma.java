package Lesson22_Arrays;

import java.util.Arrays;

public class C04_ElementYazdirma {
    public static void main(String[] args) {

        int sayilar [] = {1,2,3,4,5,6,7};

        // array'in tamamini yazdiralim

        System.out.println(Arrays.toString(sayilar));       //  [1, 2, 3, 4, 5, 6, 7]

        //  array'in tum elementlerini yazdiralim

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.print(sayilar[i]+" ");       //  1 2 3 4 5 6 7
        }


    }
}
