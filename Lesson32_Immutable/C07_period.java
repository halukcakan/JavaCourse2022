package Lesson32_Immutable;

import java.time.LocalDate;
import java.time.Period;

public class C07_period {
    public static void main(String[] args) {

        //  iki tarih arasindaki sure

        LocalDate tarih1 = LocalDate.of(1993,11,16);

        LocalDate bugun = LocalDate.now();


        Period period=Period.between(tarih1,bugun);

        System.out.println(period);     //  P29Y3M2D

    }
}
