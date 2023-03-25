package Lesson24_Multi_Dimensional_Arrays;

public class C04_mda_son_elemanlarin_carpimi {
    public static void main(String[] args) {

        /*
        ic array'deki son elemanlarin carpimi
        {{1,2,3},{4,5},{6}}
         */

        int [][] input = {{1,2,3},{4,5},{6}};
        int carpim =1;

        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j < input[i].length ; j++) {


                if (j==input[i].length-1){      //  inner array'in son elemani

                    carpim*= input[i][j];

                }


            }
        }

        System.out.println("Son elemanlarin carpimi "+carpim);

    }
}
