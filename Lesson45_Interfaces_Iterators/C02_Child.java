package Lesson45_Interfaces_Iterators;

public class C02_Child implements I01_interfaceBodyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }

    public static void main(String[] args) {

        I01_interfaceBodyOlanMethod.direksiyon();       //  statik method getirdi

        C02_Child obj = new C02_Child();                //  default oldugu icin obje yarattik

        obj.teker();


    }
}
