package Lesson14_Recap_02;

public class C09_Example_09 {
    public static void main(String[] args) {


        int sayi = 2;
        String sonuc = "";

        /*
        1) sonuca hiclik atalik
        2) switch ile aranani teker teker arayrak bulduk
        3) bulunani ayni anda sonuca atadik
        4) sonucu yazdirdik
         */


        if (sayi>=0 && sayi<=9){
            switch (sayi){
                case 1: sonuc = "bir"; break;
                case 2: sonuc = "iki"; break;
                case 3: sonuc = "uc"; break;
                case 4: sonuc = "dort"; break;
                case 5: sonuc = "bes"; break;
                case 6: sonuc = "alti"; break;
                case 7: sonuc = "yedi"; break;
                case 8: sonuc = "sekiz"; break;
                case 9: sonuc = "dokuz"; break;
                default: sonuc = "sifir"; break;
            }
            System.out.println(sonuc);
        } else System.out.println("Gecersiz sayi girdiniz");


    }
}
