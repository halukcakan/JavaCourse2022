package Lesson36_Inheritance;

public class Isci extends Personel {

    /*
    parent cocuk sahibi olmaya karar verebilir

    bu classi olusturdugumuzda personel class'indaki tum variable ve
    methodlara ihtiyaci vardir, personel class'ini parent ediniriz
     */

    int persNo = 1001;

    public static void main(String[] args) {

        Isci isci1 = new Isci();
        System.out.println(isci1.isim);         //  Isim belirtilmedi
        isci1.isim = "Suleyman";
        System.out.println(isci1.persNo);       //  1001

        /*
        kendi class'imizda isim ve persNo var mi? yok mu?
         */

        isci1.maas();       //  Isciler: min 15 euro maas/sa

    }


    public void maas (){
        System.out.println("Isciler: min 15 euro maas/sa");
    }
}
