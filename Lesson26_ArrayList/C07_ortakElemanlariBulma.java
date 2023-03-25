package Lesson26_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_ortakElemanlariBulma {
    public static void main(String[] args) {

        /*
        iki string array olusturunuz
        array'lerdeki ortak elemanlari for-each loop kullanarak bulunuz
        sonucu ekrana yazdiriniz
        eger ortak eleman yoksa "Ortak eleman yok yazdiriniz"
         */

        String [] arr1 = {"Ali","Veli","Can","Ayse"};
        String [] arr2 = {"Hasan","Enes","Ali"};

        List <String> ortakIsimler = new ArrayList<>();

        for (String each1: arr1
             ) {
            for (String each2: arr2
                 ) {

                if (each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1);
                }

            }
        }

        if (ortakIsimler.isEmpty()){
            System.out.println("Hic ortak eleman yok");
        } else System.out.println(ortakIsimler);






    }
}
