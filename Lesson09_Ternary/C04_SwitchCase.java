package Lesson09_Ternary;

public class C04_SwitchCase {
    public static void main(String[] args) {

        /*
        kullanicidan gun ismi alin
        hafta ici veya hafta sonunu yazdirin
         */

        String input = "Cumprtesi";
        input = input.toLowerCase();

        switch (input){
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("Hafta ici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecerli bir gun giriniz");



        }




    }
}
