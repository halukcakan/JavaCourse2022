package Lesson32_Immutable;

import java.time.LocalTime;

public class C05_StringBuilder {

    public static void main(String[] args) {

         /*
    String mi String builder mi daha hizlidir ?
     */

        LocalTime baslangic = LocalTime.now();

        String str ="Aaah Java";
        for (int i = 0; i <100000 ; i++) {
            str+=".";
        }

        LocalTime bitis = LocalTime.now();

        System.out.println("String zaman : "+(bitis.getNano()-baslangic.getNano()));

//---------------------------------------------------------------------------------

         baslangic = LocalTime.now();

        StringBuilder sb =new StringBuilder("Aaah Java");
        for (int i = 0; i <100000 ; i++) {
            sb.append(".");
        }

         bitis = LocalTime.now();

        System.out.println("String builder zaman : "+(bitis.getNano()-baslangic.getNano()));



    }

}
