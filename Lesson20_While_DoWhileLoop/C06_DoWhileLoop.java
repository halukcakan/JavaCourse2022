package Lesson20_While_DoWhileLoop;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        //  9'dan 190'a kadar 7'nin kati olan tum sayilari ekrana yazdir


        int bas = 9;
        int bit = 190;

        int temp = bas;


        do {
            if (temp%7==0) {
                System.out.print(temp+" ");
            }
            temp++;
        } while (temp<bit);




    }
}
