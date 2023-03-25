package LAMBDA_functional_programing.day02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp06 {
    public static void main(String[] args) {
        List<Integer> exampleList = new ArrayList<>();
        exampleList.add(8);
        exampleList.add(9);
        exampleList.add(131);
        exampleList.add(10);
        exampleList.add(9);
        exampleList.add(10);
        exampleList.add(2);
        exampleList.add(8);
        System.out.println(exampleList);

        yedidenBuyukCiftMin1(exampleList);
        System.out.println();
        yedidenBuyukCiftMin2(exampleList);
        System.out.println();
        karmasik(exampleList);

    }

    public static void yedidenBuyukCiftMin1(List<Integer> list){
        Integer min = list
                .stream()
                .distinct()
                .filter(t->t%2==0)
                .filter(t-> t>7)
                .reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);
        System.out.println(min);
    }

    public static void yedidenBuyukCiftMin2(List<Integer> list){
        Integer min = list
                .stream()
                .distinct()
                .filter(t-> t%2==0)
                .filter(t-> t>7)
                .sorted(Comparator.reverseOrder())
                .reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t :u);
        System.out.println(min);
    }

    public static void karmasik (List<Integer> list){
        List<Double> sonuc = list
                .stream()
                .distinct()
                .filter(t-> t>5)
                .map(t-> t/2.0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sonuc);
    }
}
