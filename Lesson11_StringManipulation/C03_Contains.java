package Lesson11_StringManipulation;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen email yaziniz");
        String email = scan.nextLine();

        if (email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf("gmail.com")==(email.length()-10) ) {         // int == int
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("lutefen yazimi kontrol ediniz");
        }


    }
}
