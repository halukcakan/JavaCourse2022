package Lesson25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_arrayden_listYapmak {
    public static void main(String[] args) {

        int [] arr = {2,5,7,2,3,6,8,8,5,3,1,2,5,9};

        /*
        bu kadar cok elemanli listeyi tek tek girmek yerine
        array olusturup for loop ile
        olusturdugumuz list e ekleyebiliriz
         */

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar);



    }
}
