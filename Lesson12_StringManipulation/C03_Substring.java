package Lesson12_StringManipulation;

public class C03_Substring {
    public static void main(String[] args) {

        String isim= "Suleyman";
        String soyisim= "Karanfil";
        String kartNo= "1234 5236 9731 8925";

        System.out.println(isim.substring(3));
        // eyman

        System.out.println(soyisim.substring(soyisim.length()-3));
        //  fil

        System.out.println(isim.substring(2,4));
        //  le


        String isimIlkHarf = isim.substring(0,1);
        String isimGeriyeKalanlar = isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf= soyisim.substring(0,1).toUpperCase();
        String soyisimdenGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");

        String kartNoIlkDort = kartNo.substring(0,4);
        String kartNoIlkDortHaric = " **** **** ****";


        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimdenGeriyeKalanlar+"\n"+
                kartNoIlkDort+kartNoIlkDortHaric);



    }
}
