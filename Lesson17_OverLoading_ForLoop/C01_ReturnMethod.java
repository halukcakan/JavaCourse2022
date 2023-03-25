package Lesson17_OverLoading_ForLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        /*
        verilen iki sayiyi carpan ve bize donduren method
         */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 4;

        int sonuc = carpGetir(sayi1,sayi2);
        System.out.println(sonuc);

        double sonuc2 = C01_ReturnMethod.carpGetir(sayi1,sayi3);

        System.out.println(sonuc2);


    }

    public static int carpGetir(int sayi1, int sayi2) {

        return sayi1*sayi2;

    }
}
