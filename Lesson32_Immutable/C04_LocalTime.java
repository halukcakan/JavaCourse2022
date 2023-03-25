package Lesson32_Immutable;

import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();

        

        Thread.sleep(3000);     //  3 saniye bekler


        time1=LocalTime.now();
        System.out.println(time1);      //  atamayi yaptik ve sabit deger degismez [canli saat degildir, satirin ani]
                                        //  SONRA 16. SATIRI YAZDIK











    }
}
