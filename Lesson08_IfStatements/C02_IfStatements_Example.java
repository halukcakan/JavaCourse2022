package Lesson08_IfStatements;

import java.util.Scanner;

public class C02_IfStatements_Example {
    public static void main(String[] args) {

        /*
        kullanicidan 100 uzerinden notunu isteyiniz
        50 den kucuk ise "D"
        50-60 ise "C"
        60-80 ise "B"
        80 dne buyuk ise "A"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not<50){
            System.out.println("Notunuz : D");
        } else if (not<60) {
            System.out.println("Notunuz : C");
        } else if (not<80) {
            System.out.println("Notunuz : B");
        } else if (not<100) {
            System.out.println("Notunuz : A");
        } else if (not<0 || not>100) {
            System.out.println("Gecersiz not girdiniz");
        }


    }
}
