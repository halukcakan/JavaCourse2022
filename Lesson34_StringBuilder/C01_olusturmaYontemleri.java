package Lesson34_StringBuilder;

public class C01_olusturmaYontemleri {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java guzeldir");
        StringBuilder sb3 = new StringBuilder(10);

        sb1.length();       //  0
        sb1.capacity();     //  16

        sb2.length();       //  11
        sb2.capacity();      // 27

        sb3.length();       //  0
        sb3.capacity();     //  10


        sb1.append("Java");
        sb1.length();       //  4
        sb1.capacity();     //  16

        sb1.append("candir bilen bilir.");
        sb1.length();       //  25
        sb1.capacity();     //  34  =   (16 * 2) + 2

    }
}
