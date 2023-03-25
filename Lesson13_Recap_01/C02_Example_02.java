package Lesson13_Recap_01;

import java.util.Scanner;

public class C02_Example_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Lutfen Y/N secimi yapiniz : ");
        char input= scan.next().toUpperCase().charAt(0);

        //  System.out.println(input=='Y'?"YES":"NO");

        if (input=='Y'){                        //  (input=='Y' || input=='N')
            System.out.println("YES");
        } else if (input=='N') {
            System.out.println("NO");
        } else {
            System.out.println("Gecersiz!");
        }


    }
}
