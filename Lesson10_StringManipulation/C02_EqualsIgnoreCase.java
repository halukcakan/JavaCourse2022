package Lesson10_StringManipulation;

public class C02_EqualsIgnoreCase {
    public static void main(String[] args) {


        String str1= "Ali Can";
        String str2= "ali can";
        String str3= "ALI CAN";
        String str4 = "Ali Can_";

        System.out.println(str2.equals(str1));                  //false
        System.out.println(str2.equalsIgnoreCase(str1));        //true

        System.out.println(str1.equals(str3));                  //false
        System.out.println(str1.equalsIgnoreCase(str3));        //true

        System.out.println(str1.equals(str4));                  //false
        System.out.println(str1.equalsIgnoreCase(str4));        //false

    }
}
