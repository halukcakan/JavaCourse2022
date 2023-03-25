package Lesson39_Polymorpism;

public class EToyota extends DAraba {

    void marka() {
        System.out.println("Markamiz Toyota");
    }

    @Override
    void motor() {
        System.out.println("Toyota araclar toyota motorlar kullanir");
    }
}
