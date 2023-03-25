package Lesson33_TimerFormatter_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("Ilk olusturulan tarih : "+tarihSaat);   //  2023-02-18T17:18:10.659797400


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy hh:mm a");

        System.out.println(dtf1.format(tarihSaat));     //  18/2/23 05:20 ÖS

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");

        System.out.println(dtf2.format(tarihSaat));     //  18/Şub/2023 17:22

    }
}
