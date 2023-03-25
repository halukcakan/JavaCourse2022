package Lesson21_Scope;

public class C02_StaticVariables {
    static int stcSayi = 50;

    static int degersizStaticVar;
    int degersizInstanceVar;



    public static void main(String[] args) {

        stcSayi = 56;
        System.out.println(stcSayi);    //  56
        staticMethod();
        stcSayi = 66;
        System.out.println(stcSayi);    //  66

        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        //  STATIC KLUBUNE UYE OLMADIGI ICIN OBJE OLUSTURDUK
        System.out.println(stcSayi);    //  110

    }

    public static void staticMethod() {

        System.out.println(stcSayi);        //  56


    }

    public void staticOlmayanMethod() {

        System.out.println(stcSayi);        //  66
        stcSayi = 110;


    }
}
