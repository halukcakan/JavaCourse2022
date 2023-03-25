package Lesson22_Arrays;

import java.util.Arrays;

public class C05_SolaYazdirma {
    public static void main(String[] args) {
        /*
        verilen 3 elemanli array'in
        tum elemanlari bir soldakine kaydiracak sekilde program yazin
        1,2,3 -> 2,3,1
         */

        int arr[]= {1,2,3,4,5};

        int temp = arr[0];

        for (int i = 0; i < arr.length-1 ; i++) {

            arr[i]= arr[i+1];

        }

        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));


    }
}
