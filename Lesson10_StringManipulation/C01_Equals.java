package Lesson10_StringManipulation;

public class C01_Equals {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "Ali Can" + "";
        String str3 = new String("Ali Can");

        System.out.println(str1 == str2);           // true
        System.out.println(str1.equals(str2));      // true


        System.out.println(str1==str3);             //false
        System.out.println(str1.equals(str3));      //true

            /*
            == her zaman kullanma onun yerine equals kullanmak daha iyi
             */


    }
}
