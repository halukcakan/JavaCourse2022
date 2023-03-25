package Lesson31_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C02 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("Ilk basta list : "+list);

        elemanlariDegistir (list);

        System.out.println("elemanlari degistir methodundan sonra list : "+ list);

        listDegistir(list);

        System.out.println("list degistir methodundan sonra list : "+list);


    }

    public static void listDegistir(List<String> list) {
        list= new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Biskrem");
        System.out.println("list degistir methodunda : "+list);
    }

    public static void elemanlariDegistir(List<String> list) {
        list.set(0,"Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");
        System.out.println("elemanlar degistir methodunda list : "+list);
    }
}
