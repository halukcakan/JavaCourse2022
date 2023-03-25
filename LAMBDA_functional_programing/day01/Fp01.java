package LAMBDA_functional_programing.day01;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {

    /*

     */

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

        listeElemanlariniYazdir(exampleList);
        System.out.println("");
        listeElemanlariYazdirFunctional(exampleList);

    }
    
    public static void listeElemanlariniYazdir(List<Integer> list){

        for (Integer each :list
             ) {
            System.out.print(each+" ");
        }
        
    }

    public static void listeElemanlariYazdirFunctional (List<Integer> list){

        list.stream().forEach(t-> System.out.print(t+" "));

    }

}
