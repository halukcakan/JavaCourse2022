package Lesson13_Recap_01;

public class C03_Example_03 {
    public static void main(String[] args) {

        int not = 80;

        boolean A = (not>=90 && not<=100);
        boolean B = (not>=80 && not<=89);
        boolean C = (not>=70 && not<=79);
        boolean D = (not>=60 && not<=69);
        boolean E = (not>=0 && not<=59);

        if (A) System.out.println("Notunuz: A");
        else if (B) System.out.println("Notunuz : B");
        else if (C) System.out.println("Notunuz : C");
        else if (D) System.out.println("Notunuz : D");
        else if (E) System.out.println("Notunuz : E");
        else System.out.println("Yanlis not girildi");





    }
}
