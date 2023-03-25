package Lesson30_Statik_Block;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati = 100;

        System.out.println(indirimliFiyat(satisFiyati));        //  90
        System.out.println(satisFiyati);
        System.out.println(indirimliFiyat(satisFiyati));        //  90

    }

    public static double indirimliFiyat (double orjinalFiyat){
        /*
        %10 indirim yapip
        yeni fiyati main methoda dondursun
         */

        double satisFiyati = orjinalFiyat*0.9;


        return orjinalFiyat*90/100;
    }
}
