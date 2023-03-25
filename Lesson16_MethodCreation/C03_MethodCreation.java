package Lesson16_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // O.... C...

        String isim = "ozlem";
        String soyisim = "cakan";

        System.out.println(isim +" "+soyisim);      //ozlem cakan
        ismiGizle(isim, soyisim);                   // O.... C....

    }

    public static void ismiGizle(String isim, String soyisim) {

        isim = isim.toUpperCase().substring(0,1) + isim.substring(1).replaceAll("\\w", "*");
        soyisim = soyisim.toUpperCase().substring(0,1) + soyisim.substring(1).replaceAll("\\w", "*");

        System.out.println(isim+"\t"+soyisim);


    }
}
