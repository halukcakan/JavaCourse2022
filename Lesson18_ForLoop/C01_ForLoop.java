package Lesson18_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {


        /*
        verilen sayinin pozitif tam bolenlerini yazdiralim
         */

        int input = 120;

        for (int i=1 ; i<=input ; i++) {

            if (input%i==0){
                System.out.print(i+ " ");
            }

        }


    }
}
