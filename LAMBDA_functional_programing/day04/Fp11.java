package LAMBDA_functional_programing.day04;

import java.util.ArrayList;
import java.util.List;

public class Fp11 {
    public static void main(String[] args) {
        List<String> exampleList2 = new ArrayList<>();
        exampleList2.add("Ali");
        exampleList2.add("Ali");
        exampleList2.add("Mark");
        exampleList2.add("Amanda");
        exampleList2.add("Hatice");
        exampleList2.add("Jackson");
        exampleList2.add("Mariano");
        exampleList2.add("Alberto");
        exampleList2.add("Tucker");
        exampleList2.add("Benjamin");
        System.out.println(exampleList2);

        System.out.println(hepsininUzunlugu12denAzMi(exampleList2));
    }

    public static boolean hepsininUzunlugu12denAzMi (List<String>list){
        return list
                .stream()
                .allMatch(t-> t.length()-1<12);

    }
}
