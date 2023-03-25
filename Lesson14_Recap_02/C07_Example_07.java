package Lesson14_Recap_02;

import java.util.Scanner;

public class C07_Example_07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Yasiniz : ");
        int yas = scan.nextInt();

        System.out.print("Kilonuz : ");
        double kilo = scan.nextDouble();

        if (yas<18) System.out.println("Kan bagisi yapamazsiniz");
        else if (yas>18 && kilo>50) System.out.println("Kan bagisi yapabilirsiniz");
        else System.out.println("Kan bagisi yapamazsiniz");


    }
}
