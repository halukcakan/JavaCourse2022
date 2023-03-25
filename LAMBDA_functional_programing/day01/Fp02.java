package LAMBDA_functional_programing.day01;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {
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

        ciftElemanlariYazdirStructed(exampleList);
        System.out.println("");
        ciftElemanlariYazdirFunctional(exampleList);


    }

    public static void ciftElemanlariYazdirStructed(List<Integer> list){

        for (Integer each:list
             ) {
            if (each%2==0){
                System.out.print(each+" ");
            }
        }

    }

    public static void ciftElemanlariYazdirFunctional (List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }
}
