package Lesson25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_arrayList_remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Ati");
        isimler.add("Ciki");
        isimler.add("Haluk");
        isimler.add("Ozlem");

        isimler.remove("Ati");
        System.out.println(isimler);

    }
}
