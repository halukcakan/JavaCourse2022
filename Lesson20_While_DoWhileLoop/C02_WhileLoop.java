package Lesson20_While_DoWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        /*

       kullanicidan bir sayi alin ve
       bu sayinin rakamlari toplamini yazdirin
         */

        int input = 6509;
        int temp = input;
        int birlerBas = 0;
        int rakalmlarToplami = 0;

        while (temp>0){
            birlerBas=temp % 10;
            rakalmlarToplami+=birlerBas;
            temp /= 10;
        }
        System.out.println(input+" sayisinin rakamlari toplami : "+rakalmlarToplami);



    }
}
