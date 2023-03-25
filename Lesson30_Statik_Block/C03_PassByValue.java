package Lesson30_Statik_Block;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %25 indirimli flyati hesaplayip bize donduren method olustur
         */

        double satisFiyati = 100;

        double indirimliFiyat = indirimliFiyatHesapla (satisFiyati);

    }

    public static double indirimliFiyatHesapla(double satisFiyati) {
        double indirimliFiyat= satisFiyati*0.75;

        return indirimliFiyat;

    }
}
