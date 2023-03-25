package Lesson03_Scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz :");
        String isim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz :");
        int yas = scan.nextInt();

        System.out.println(isim+ " "+ yas);



    }
}
