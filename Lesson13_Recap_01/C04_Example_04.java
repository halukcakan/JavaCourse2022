package Lesson13_Recap_01;

import java.util.Scanner;

public class C04_Example_04     {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Mesleginizi giriniz : ");
        String jobTitle = scan.next().toLowerCase();


        switch (jobTitle){
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developper");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("Gecersiz meslek girdiniz");
                break;




        }






    }
}
