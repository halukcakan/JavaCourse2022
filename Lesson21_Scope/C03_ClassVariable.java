package Lesson21_Scope;

public class C03_ClassVariable {
    public static void main(String[] args) {

        //  C02_staticVariables.stcSayi=0;

        C02_StaticVariables.staticMethod();     //  56
        System.out.println(C02_StaticVariables.stcSayi);        //  50
        System.out.println(C02_StaticVariables.degersizStaticVar);      //  0


        /*

        DEFAULT DEGERLER
        int --> 0
        string --> null
        boolean --> false
        char --> ''(hiclik)

         */


        C02_StaticVariables obje1 = new C02_StaticVariables ();
        obje1.staticOlmayanMethod();    //  66
        // bu method icerisinde static sayi 110 oldu

    }
}
