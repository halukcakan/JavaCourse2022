package Lesson05_Matematikselslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi = 10;

        System.out.println("pre-increment : "+ ++sayi);

        System.out.println("pre-increment'ten sonra :" +sayi);


        sayi = 10;

        System.out.println("post-increment :" + sayi++);

        System.out.println("post-increment'ten sonra :" +sayi);


    }
}
