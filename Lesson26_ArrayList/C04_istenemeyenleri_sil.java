package Lesson26_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_istenemeyenleri_sil {
    public static void main(String[] args) {

        //  verilen bir array'de istenmeyen harf iceren kelimeleri silip
        //  kalan elementleri eski array'e tekrar atayin

        String [] sehirler = {"Istanbul","Ankara","Mersin","Bandirma","Konya"};
        System.out.println(Arrays.toString(sehirler));
        String istenmeyenHarf = "s";
        List <String> kalanlar = new ArrayList<>();

        for (int i = 0; i < sehirler.length ; i++) {
            if (!sehirler[i].contains(istenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }
        }
        // loop bittiginde istenmeyen harf icermeyen sehirler listeye eklenmis olacak



        String [] kalanlarArray = new String[kalanlar.size()];

        for (int i = 0; i < kalanlarArray.length ; i++) {
            kalanlarArray[i]=kalanlar.get(i);
        }
        sehirler=kalanlarArray;
        System.out.println(Arrays.toString(sehirler));



    }
}
