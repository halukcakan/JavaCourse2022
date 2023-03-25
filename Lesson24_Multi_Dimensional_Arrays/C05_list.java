package Lesson24_Multi_Dimensional_Arrays;

import java.util.ArrayList;
import java.util.List;

public class C05_list {
    public static void main(String[] args) {

        /*
        array'i array yapan sembol []
        arrayList de ise <> kullaniriz
         */

        List<String> isimler = new ArrayList<>();       //  []

        System.out.println(isimler);

        //  bir list'e eleman eklemek istersek

        isimler.add("Basak");
        System.out.println(isimler.add("Ayse"));        //  true    [no need]


        /*
        String'de bir method'u calistirdigimizda
        assign yapmazsak String degismiyordu

        String isim = "Suleyman"
        isim.toUpperCase();     // SULEYMAN
        sout(isim)      // Suleyman
         */

        /*
        sadece bir olumsuz yani elemanleri TEKER TEKER eklemek zorundasiniz
         */



    }
}
