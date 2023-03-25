package Lesson17_OverLoading_ForLoop;

public class C03_OverLoading {
    public static void main(String[] args) {


        topla(5,7);
        topla(2,7.9);
        topla(3.4,2.1);

    }

    public static void topla (int sayi1,int sayi2){

        System.out.println("Iki integer`in toplami : "+(sayi1+sayi2));
    }
    /*

    public static void topla (int sayi3,int sayi4){

        System.out.println("Iki integer`in toplami : "+(sayi3+sayi4));
    }

     */

    public static void topla (double sayi1,int sayi2){

        System.out.println("Bir double ve bir integer`in toplami : "+(sayi1+sayi2));
    }

    public static void topla (int sayi1,double sayi2){

        System.out.println("Bir integer ve bir double`in toplami : "+(sayi1+sayi2));
    }

    public static void topla (double sayi1,double sayi2){

        System.out.println("Iki double`in toplami : "+(sayi1+sayi2));
    }
}
