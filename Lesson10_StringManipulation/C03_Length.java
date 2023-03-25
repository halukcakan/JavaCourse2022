package Lesson10_StringManipulation;

public class C03_Length {
    public static void main(String[] args) {

        String str1= "Java ogren isi kap";

        System.out.println(str1.length());

        System.out.println(str1.toUpperCase().charAt(str1.length()-1));


        String str2 = "";                           // hiclik

        System.out.println(str2.length());

            /*
            hiclik var fakat sifir adet uzunlugu var
             */

        String str3 = null;

        System.out.println(str3.length());

            /*
            bir deger atanmamis ki uzunlugu olsun
            cunku bu bir atama yapilmadigina isaret eder
             */

    }
}
