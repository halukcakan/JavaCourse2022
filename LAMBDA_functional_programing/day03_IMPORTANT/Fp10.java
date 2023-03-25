package LAMBDA_functional_programing.day03_IMPORTANT;

import LAMBDA_functional_programing.day02.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp10 {
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


        sonKaraktereGoreSiralaYazdir(exampleList2);

    }

    public static void sonKaraktereGoreSiralaYazdir(List<String>list){
        list
                .stream()
                .distinct()
                .sorted(Comparator.comparing(Utils::sonKarakteriAl))
                .forEach(Utils::ayniSatirdaBosluklarYazdir);



        /*
        son karakteri ayni olan elementlerde
        natural order yapar
         */
    }

    public static void istenenleriListenSil(List<String>list){
        list
                .removeIf(t->t.charAt(0)=='A' || t.charAt(0)=='a' ||
                            t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n');
    }
}
