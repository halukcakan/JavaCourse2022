package Lesson20_While_DoWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        int sayi =7;

        while (sayi<10){

            System.out.print(sayi);

            sayi++;
        }

        do{
            System.out.println(sayi);
            sayi++;
        }while (sayi<10);


    }
}
