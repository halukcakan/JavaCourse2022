package Lesson23_Arrays;

import java.util.Arrays;

public class C05_Split {
    public static void main(String[] args) {

        String str = "Java ne kadar guzel";

        String [] kelimeler =  str.split("ne ");

        System.out.println(Arrays.toString(kelimeler));

        String [] karakterler =  str.split("");

        System.out.println(Arrays.toString(karakterler));


    }
}
