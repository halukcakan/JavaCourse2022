package Lesson33_TimerFormatter_Varargs;

public class C02_varargs {
    public static void main(String[] args) {

        // verilen 2 int'i toplayip yazdiran bir method olus

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;

        toplaYazdir (sayi1,sayi2,sayi3,sayi4);

    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
    }

    public static void toplaYazdir(int sayi1, int sayi2, int sayi3) {

        System.out.println("Toplam : "+sayi1+sayi2+sayi3);

    }

    public static void toplaYazdir(int sayi1, int sayi2) {

        System.out.println("Toplam : "+(sayi1+sayi2));

    }
}
