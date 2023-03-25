package Lesson32_Immutable;

import java.time.LocalDate;
import java.time.Month;

public class C03_date {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih);

        System.out.println(tarih.getDayOfYear());       //  yilin kacinci gunu

        System.out.println(tarih.getDayOfWeek());       //  haftanin hangi gunu

        System.out.println(tarih.getMonthValue());      //  hangi ay [number]


        LocalDate tarih2= LocalDate.of(2001,5,15);

        LocalDate tarih3 = LocalDate.of(1990, Month.JANUARY,10);

        System.out.println(tarih.plusDays(100));        //  100 gun sonra hangi tarih

        tarih3.minusYears(3).minusMonths(2).minusDays(19);

        System.out.println(tarih.isAfter(tarih2));      //  true


    }
}
