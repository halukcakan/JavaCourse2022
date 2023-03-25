package LAMBDA_functional_programing.day03_IMPORTANT;

import LAMBDA_functional_programing.day02.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp09 {
    public static void main(String[] args) {
        List<String> exampleList2 = new ArrayList<>();
        exampleList2.add("Ali");
        exampleList2.add("Ali");
        exampleList2.add("Mark");
        exampleList2.add("Christopher");
        exampleList2.add("Hatice");
        exampleList2.add("Jackson");
        exampleList2.add("Mariano");
        exampleList2.add("Alberto");
        exampleList2.add("Tucker");
        exampleList2.add("Benjamin");
        System.out.println(exampleList2);

        harfMiktarinaGoreSiralaYazdir(exampleList2);


    }

    public static void harfMiktarinaGoreSiralaYazdir(List<String>list){
        list
                .stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(Utils::ayniSatirdaBosluklarYazdir);

        /*
                .sorted(Comparator.comparing(String::length).reversed())
                dersek
                uzun kelimeden baslayarak kisa kelimeye dogru siralar
        */
    }
}
