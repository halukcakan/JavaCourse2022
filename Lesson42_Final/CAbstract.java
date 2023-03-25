package Lesson42_Final;

public abstract class CAbstract {

    /*
    abstract class method'larla ilgilidir
     */

    void toplama (){
        System.out.println("Toplama islemi yapar");
    }

    abstract void carpma();

    abstract void cikarma();

    void bolme (){
        System.out.println("Cikarma islemi yapar");
    }

}
