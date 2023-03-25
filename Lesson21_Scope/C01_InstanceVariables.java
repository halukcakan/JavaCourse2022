package Lesson21_Scope;

public class C01_InstanceVariables {
    int instSayi = 20;  //  static olmayip class leved'da oldugu icin ==> instance variable




    public static void main(String[] args) {


        /*
        class icerisinde heryerden kullanmak istedigimiz variable'lari
        class level'da [Class icerisinde ama methodlarin disarisinda]
         */



        int sayi =10;

        /*

          System.out.println(instSayi);
          instance variables static klube uye olmadigi icin main methoddan direk kullanilmaz
                instance variables = oblect variables
          obje olusturulursa instance variable'lari heryerden kullanabiliriz
         */

        C01_InstanceVariables obje1 = new C01_InstanceVariables();
        System.out.println(obje1.instSayi);         //  20
        obje1.instSayi=25;                      //  25

        C01_InstanceVariables obje2 = new C01_InstanceVariables();
        System.out.println(obje2.instSayi);         //  20
        obje2.instSayi=40;                      //  40



    }

    public static void staticMethod(){

        // bir method icerisinde olusturulan sayi sadce o sayi icerisinde kullanilir

        /*
        static klubune uye olmayan bir methodda bulunan ints burayada gelmez
        tek kosul obje olusturmaktir
         */

        C01_InstanceVariables obje3 = new C01_InstanceVariables();
        System.out.println(obje3.instSayi);

    }

    public  void staticOlmayanMethodd(){

        //  INTS VARIABLE'NIN BULUNDUGU METHOD VE BU METHOD STATIC OLMADIGI ICIN .... =>

        System.out.println(instSayi);

    }
}
