package Lesson40_Exceptions;

public class C01_exceptions {

    public static void main(String[] args) {


        int a = 10000;
        int b = 50;
        int sayac = 1;

        while (sayac<=100){

            if (b == 0) {
                System.out.println("Islem yapilirken payda 0 degerini aldi");
            } else System.out.println(a/b);


            b--;
            sayac++;
        }




    }
}
