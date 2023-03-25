package Lesson39_Polymorpism;

public class FSupra extends EToyota{

    void yakit(){

        System.out.println("Supra benzin kullanir");
    }

    @Override
    void motor() {
        System.out.println("Sirali alti silindir 2JZ motor kullanir");
        /*
        @Override notayonu :
        Java, bu notasyonla birbirine bagli olan iki methodu surekli kontrol eder
        Eger parent class taki overriding methodu silerseniz CTE verir
         */
    }
}
