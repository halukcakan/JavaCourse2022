package LAMBDA_functional_programing.day01;

import java.util.ArrayList;
import java.util.List;

public class Fp03 {
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

        tekElemanlarinKareleriniYazdir(exampleList);

    }
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
        list
                .stream()
                .filter(t->t%2!=0)
                .map(t->t*t)
                .forEach(t-> System.out.print(t+" "));
    }
}
