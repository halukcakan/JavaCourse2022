package Lesson34_StringBuilder;

public class C03_subSequence {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Kayra");

        sb.substring(0,3);

        /*
        bu method string dondurdugu [immutable] icin eski halini degistiremez
         */

        System.out.println(sb);     //  Kayra


        sb.subSequence(0,3);

        System.out.println(sb);     //  Kayra
    }
}
