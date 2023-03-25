package Lesson43_AbstractClass_Interface;

public class C02_exceptions {
    public static void main(String[] args) {

        try {
            calis();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calis() {
        throw new RuntimeException("Cooookkk CAAALLIISSSS");
    }

    /*
    throw ile kontrollu exception olustururken
    parametre olarak istedigimiz hata mesajini olusturabilir
     */
}
