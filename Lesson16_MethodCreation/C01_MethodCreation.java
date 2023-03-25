package Lesson16_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        tertenYazdir("kale");

        C01_MethodCreation.tertenYazdir("hizl");

    }

    public static void tertenYazdir (String input) {

        String tersInput =  input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);

        System.out.println("Verilen inputun terten yazilisi : "+tersInput);
    }
}
