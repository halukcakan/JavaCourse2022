package Lesson18_ForLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {

        /*
        kullancidan 100den kucuk bir sayi isteyin
        1`den baslayarak girilen sayiya kadar tum sayilari yazdirin ancak:
        1) sayi 3 un kati ise sayi yerine "Java"
        2) sayi 5 in kati ise sayi yerine "Guzeldir"
        3) sayi hem 3 un hem 5 in kati ise sayi yerine "Java guzeldir"
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100`den kucuk bir sayi giriniz : ");
        int input = scan.nextInt();


        for (int i = 1; i <= input ; i++) {

            if (i%3 == 0 && i%5 == 0) {
                System.out.print("Java guzeldir \n");
            } else if (i%3 == 0) {
                System.out.print("Java ");
            } else if (i%5 == 0) {
                System.out.print("Guzeldir ");
            } else System.out.print(i+" ");
        }

    }
}
