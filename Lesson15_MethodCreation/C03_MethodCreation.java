package Lesson15_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

        String str="Java her gecen gun guzel";

        System.out.println(str.substring(0,4));         // 0 dahil 4 dahil degil

        int input1 = 10;
        int input2 = 20;

        // method 4 adimda olusturulu
        //      1) method call
        //      2) argument eklenmesi gerekiyorsa ekleyelim
        //          eger method u n return type void den farkli olacaksa
        //          bir variable olusturup, method call u assign edelim

        topla(input1,input2);



    }

    private static void topla(int input1 , int input2) {

        //      3) method deklerasyonunda degistirilmesi gereken
        //          bolumleri degistir [access modifier, return type]
        //      4) eger return type void disinda bir seyse
        //          return keyword u ve donecek degeri hesaplamaliyiz

        System.out.println(input1+input2);
    }
}
