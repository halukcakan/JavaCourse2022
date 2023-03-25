package LAMBDA_functional_programing.day02;

import java.util.ArrayList;
import java.util.List;

public class Fp05 {
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

        getMaxEleman1(exampleList);
        System.out.println();
        getMaxEleman2(exampleList);

    }

    public static void getMaxEleman1(List<Integer>list){
        Integer max =list
                .stream()
                .distinct()
                .reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u);
        System.out.println(max);
    }

    public static void getMaxEleman2(List<Integer>list){
        Integer max = list
                .stream()
                .distinct()
                .sorted()
                .reduce(Integer.MIN_VALUE, (t,u)->u);
        System.out.println(max);
    }
}
