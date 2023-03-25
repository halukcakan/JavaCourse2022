package Lesson20_While_DoWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan iki harf alip
        onlarda dahil olmak uzere aralarindaki tum sayilari buyuk harf yazdir
        kullanicinin hata yapmadigi farziyla
         */

        char ilkHarf = 'b';
        char sonHarf = 'd';

        char temp = ilkHarf;
        String buluyt = "";


        while (temp<=sonHarf){
            buluyt = temp+"";                   //  STRING = CHAR + ""
            System.out.print(temp);             //  "" olmazsa kabul etmez cunku biri str biri char
            temp++;
        }

    }
}
