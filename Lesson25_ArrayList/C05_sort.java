package Lesson25_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C05_sort {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Ciki");
        isimler.add("Ati");
        isimler.add("Haluk");
        isimler.add("Ozlem");

        Collections.sort(isimler);

        System.out.println(isimler);        //  [Ati, Ciki, Haluk, Ozlem]
    }
}
