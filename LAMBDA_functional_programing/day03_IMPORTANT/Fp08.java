package LAMBDA_functional_programing.day03_IMPORTANT;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fp08 {
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

        System.out.println();
        System.out.println(exampleList2);
        buyukHarfleListOlarakYazdir(exampleList2);      //  LIST KALICI OLARAK DEGISTI
        System.out.println(exampleList2);
        System.out.println();

        System.out.println(exampleList2);
        buyukHarfleYazdir(exampleList2);            //  LIST KALICI SEKILDE DEGISTI
        System.out.println(exampleList2);
        System.out.println();

    }

    public static void buyukHarfleListOlarakYazdir (List<String> list){

        List<String>sonuc= list
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(sonuc);

    }

    public static void buyukHarfleYazdir (List<String>list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
}
