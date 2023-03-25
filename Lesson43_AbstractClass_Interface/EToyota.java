package Lesson43_AbstractClass_Interface;

public abstract class EToyota extends DAraba {
    @Override
    protected void yakit() {

    }

    @Override
    protected void motor() {
        System.out.println("Toyota araba cevreci motor kullanir");
    }

    /*
    parent class'taki abstract methodlarin tamami child class tarafindan override edilmelidir

    concrete methodlar override edilme mecburiyeti yoktur
     */
}
