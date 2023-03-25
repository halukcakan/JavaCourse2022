package Lesson16_MethodCreation;

public class C04_MethodCreation_ReturnType {
    public static void main(String[] args) {

        // O.... C....
        //NOT: projen(software)in ilerleyen kisimlarinda isim ve soy isim boyle kullanilacak


        String isim = "ozlem";
        String soyisim = "cakan";

        String kaydetIsimGizle = ismiGizle(isim, soyisim);

        System.out.println(isim +" "+soyisim);  // ozlem cakan
        System.out.println(kaydetIsimGizle);    //O.... C....



    }

    public static String ismiGizle(String isim, String soyisim) {
        isim = isim.toUpperCase().substring(0,1) + isim.substring(1).replaceAll("\\w", "*");
        soyisim = soyisim.toUpperCase().substring(0,1) + soyisim.substring(1).replaceAll("\\w", "*");

        return isim+" "+soyisim;


    }
}
