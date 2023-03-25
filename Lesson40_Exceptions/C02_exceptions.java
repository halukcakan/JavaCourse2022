package Lesson40_Exceptions;

public class C02_exceptions {
    public static void main(String[] args) {

        int a = 10000;
        int b = 50;
        int sayac = 1;

        while (sayac<=100){

            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("Yapilan islemde payda 0 oldu");
            }


            b--;
            sayac++;
        }


    }
}
