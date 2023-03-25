package Lesson44_AbstractClass_Interfaces;

public class C02_interfaces implements I02_interfaces, I01_interfaces{


    public static void main(String[] args) {


        System.out.println(I01_interfaces.SAYI);
        System.out.println(I02_interfaces.SAYI);

    }

    @Override
    public void yakit() {

    }

    @Override
    public void teker() {

    }

    @Override
    public void motor() {

    }
}
