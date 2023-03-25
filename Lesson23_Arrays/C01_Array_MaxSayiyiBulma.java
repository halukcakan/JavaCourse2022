package Lesson23_Arrays;

public class C01_Array_MaxSayiyiBulma {
    public static void main(String[] args) {

        // arraydaki en buyuk sayiyi yazdir

        int [] sayilar = {3,6,7,2,6,8};

        maxSayiyiYazdir (sayilar);



    }

    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi = sayilar[0];

        for (int i=1; i<sayilar.length ; i++) {



            if (sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }

        }

        System.out.println("Array'daki en buyuk sayi : "+maxSayi);


    }
}
