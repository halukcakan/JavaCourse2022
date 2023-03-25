package Lesson07_IfStatements;

public class C03_IfStatements {
    public static void main(String[] args) {


        int sayi=-10;   // -12 ve -15 ile deneyerek konuyu pekistir

        if (sayi>0) {
            System.out.println("sayi pozitif");                 // body
            System.out.println("pozitif kalacaktir");           // body
        }
        if (sayi%2==0)
            System.out.println("sayi cift");                    // body
        System.out.println("cift kalacaktir");              // body degil

        if (sayi%5==0) System.out.println("sayi besin kati");   // body
        System.out.println("besin kati kalacaktir");        // body degil


            /*
            birinci if sartinda {} kullanildi ikinci ve ucuncu sartlarda kullanilmadi
            ikinci ve ucuncu if sartlarinda tamamen aynididr
             */
    }
}
