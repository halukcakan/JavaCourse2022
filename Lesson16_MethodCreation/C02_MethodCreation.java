package Lesson16_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        int input = 256;

        rakamlariTopla (input);



    }

    public static void rakamlariTopla(int input) {

        int rakamlariToplami = 0;
        int birlerBasamagi = 0;

        birlerBasamagi = input % 10;
        rakamlariToplami += birlerBasamagi;

        int onlarBasamagi = 0;
        onlarBasamagi = (input / 10) % 10;
        rakamlariToplami += onlarBasamagi;

        int yuzlerBasamagi = 0;
        yuzlerBasamagi = input / 100;
        rakamlariToplami += yuzlerBasamagi;

        System.out.println(rakamlariToplami);




    }
}
