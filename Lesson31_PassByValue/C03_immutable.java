package Lesson31_PassByValue;

public class C03_immutable {
    public static void main(String[] args) {

        String str = "Yildiz bank";

        System.out.println(str.toLowerCase());  //  yildiz bank

        str.toUpperCase();

        System.out.println(str);    //  Yildiz bank

        str.substring(3,5);


        StringBuilder sb = new StringBuilder("Java Bank");

        System.out.println(sb);     //  Java Bank

        sb.reverse();

        System.out.println(sb);     //  knaB avaJ

        sb.append(".");

        System.out.println(sb);     //  knaB avaJ.


    }
}
