package Lesson04_DataCasting;

public class C04_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1 = 20;

        int sayi2 = sayi1 + 1; // 11 eder

        sayi2 += 5;  // 16 eder



        sayi1 = 10;

        /*
            asagidaki pre ve post islemleri farklidir
            sayi++ [post increment] once sayinin solundaki kisimi uygular sonra sayiyi bir arttirir
            ++sayi [pre increment] ilk once sayiyi bir artirir ardindan sol tarafta bulunan kismi uygular
         */

        System.out.println(sayi1++);  // 10  yazdirdi ardindan 10+1 yapti
        System.out.println(sayi1);  // 10+1 i yazdirdi

        sayi1 = 10;

        System.out.println(++sayi1);  // 10+1 yapti ardindan yazdirdi
        System.out.println(sayi1);   // 10+1 yazdirdi

    }
}
