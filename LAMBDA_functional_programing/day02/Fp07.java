package LAMBDA_functional_programing.day02;

import java.util.ArrayList;
import java.util.List;

public class Fp07 {
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

        listElemanlariniYazdirFunctional(exampleList);
        System.out.println();
        ciftElemanalriYazdir(exampleList);
        System.out.println();
        tekElemanlarinKareleriniYazdir(exampleList);

    }
    public static void listElemanlariniYazdirFunctional (List<Integer>list){
        list
                .stream()
                .forEach(Utils::ayniSatirdaBosluklarYazdir);
    }

    public static void ciftElemanalriYazdir (List<Integer>list){
        list
                .stream()
                .filter(Utils::ciftElemanlariSec)
                .forEach(Utils::ayniSatirdaBosluklarYazdir);
    }

    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){
        list
                .stream()

                .filter(Utils::tektElemanlariSec)
                .map(Utils::karesiniAl)
                .forEach(Utils::ayniSatirdaBosluklarYazdir);
    }

}
