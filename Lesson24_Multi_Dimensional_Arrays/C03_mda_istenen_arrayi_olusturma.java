package Lesson24_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class C03_mda_istenen_arrayi_olusturma {
    public static void main(String[] args) {

        // {{1,2,3},{4,5},{6,7}} --> 1+2+3=6 , 4+5=9 , 6+7=13 -> { 6 ,9 , 13}



        int [][] input = {{1,2,3},{4,5},{6,7}};
        int [] yeniArray = new int [input.length];
        int toplam = 0;

        for (int i = 0; i < input.length ; i++) {       //  dis loop outer array'i gezer
            for (int j = 0; j < input[i].length ; j++) {        //  ic loop inner array'i gezer

                toplam+= input[i][j];


            }
            yeniArray[i]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(yeniArray));

    }
}
