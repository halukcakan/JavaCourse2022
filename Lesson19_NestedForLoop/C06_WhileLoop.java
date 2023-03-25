package Lesson19_NestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {


        /*
        kullanicidan sayilari aliniz
        sayilarin toplami 500 u gecince
        sayilarin toplamini ve kac sayi topladigini su sekilde yadirin

        13 sayi girdiniz ve toplamlari 567
         */

        int toplam = 0;
        int sayi = 0;
        int sayac =0;
        Scanner scan = new Scanner(System.in);

        while (toplam<500){
            System.out.println("Lutfen toplanacak sayilari giriniz : ");
            sayi = scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println("Sayilarin toplami 500'u gecmesi icin "+sayac+" sayi girilmistir." +
                "\nToplam : "+toplam);



    }
}
