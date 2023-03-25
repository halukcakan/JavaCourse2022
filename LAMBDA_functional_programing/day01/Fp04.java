package LAMBDA_functional_programing.day01;

import java.util.ArrayList;
import java.util.List;

public class Fp04 {
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

        tekrarsizTekElemanlarinKupunuYazdir(exampleList);

        tekrarsizCiftElemanlarinKareToplami(exampleList);

    }

    public static void tekrarsizTekElemanlarinKupunuYazdir (List<Integer> list){
        list
                .stream()
                .distinct()
                .filter(t->t%2!=0)
                .map(t->t*t*t)
                .forEach(t-> System.out.print(t+" "));
    }

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){
        Integer toplam =list
                .stream()
                .distinct()
                .filter(t->t%2==0)
                .map(t->t*t)
                .reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }
}
