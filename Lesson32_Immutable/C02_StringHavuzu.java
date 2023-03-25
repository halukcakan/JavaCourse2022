package Lesson32_Immutable;

public class C02_StringHavuzu {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = str1+"";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        System.out.println(str1==str2);     //  false
        System.out.println(str1.equals(str2));      //  true

        System.out.println(str1.equals(str3));      //  true
        System.out.println(str1==str3);     //  false

        System.out.println(str2.equals(str4));      //  true
        System.out.println(str2==str4);     //  false


        String str5 = "Ali Can";
        String str6 = str1;

        System.out.println(str1.equals(str5));      //  true
        System.out.println(str5==str1);     //  true



    }
}
