package Lesson24_Multi_Dimensional_Arrays;

public class C02_tum_elementleri_yazdirma {
    public static void main(String[] args) {


        int [][] sayilar = {{1,5,6,9,4},{2,5},{3,1,6}};

        elementleriYazdir (sayilar);


    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) {

            for (int j = 0; j < sayilar[i].length ; j++) {      //  inner array'lerin uzunluguna bagladik

                System.out.print(sayilar[i][j]+" ");

            }
        }
    }

}
