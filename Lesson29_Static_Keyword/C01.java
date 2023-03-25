package Lesson29_Static_Keyword;

public class C01 {

    static int  sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {

        C01 obj1 =new C01();
        // OBJE OLUSTURULDUKTAN SONRA rakama deger atanmis mi hayir o zaman ->
        System.out.println("obj1'in rakam degeri : "+obj1.rakam);         // 5
        System.out.println("obj1'in sayi degeri : "+sayi);      //  static oldugu icin hemen buldu


        obj1.rakam+=1;      // 5+1
        sayi+=1;    // 10+1

        /*
        bir arttirdiktan sonra
         */

        System.out.println("obj1'in rakam degeri : "+obj1.rakam);         // 6
        System.out.println("obj1'in sayi degeri : "+sayi);      // 11


        //------------------------------------------------------------------------------------------


        C01 obj2 = new C01();

        System.out.println("obj2'in rakam degeri : "+obj2.rakam);         // 5
        System.out.println("obj2'in sayi degeri : "+sayi);      //  11

        obj2.rakam+=1;      // 5+1
        sayi+=1;    // 11+1







    }


}
