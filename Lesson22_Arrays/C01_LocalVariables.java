package Lesson22_Arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {


        int sayi = 10;

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            //  i sadece loop icersinde olusturulmus bir local variable'dir
        }

        // static int input = 30;       burada yapilamaz izin vermez sadece class level'da olur

    }

    public static void method(){

        /*
        sayi main method'da olusturulmus bir local variable'dir
        ve sadce main method'da gecerlidir
         */

        int sayiMethod = 20;



    }
}
