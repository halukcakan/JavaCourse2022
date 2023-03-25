package Lesson28_Construction;

import Lesson27_Constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {


        // bir gun onceki Car class'indan obje olusturalim

        Car car1 = new Car();
        System.out.println(car1.fiyat);


        Araba araba1 = new Araba();
        araba1.fiyat = 10000;
        araba1.marka = "Mercedes";
        araba1.yil = 2010;
        araba1.model = "C180";

        System.out.println("Araba 1 bilgiler\n" +
                "Marka : "+araba1.marka+"\nModel : "+araba1.model+"\nYil : "+araba1.yil+"\nFiyat : "+araba1.fiyat);

        /*

         */


        Araba araba2 = new Araba("BMW","5.20",2011,15000);

        System.out.println("Araba 2 bilgiler\n" +
                "Marka : "+araba2.marka+"\nModel : "+araba2.model+"\nYil : "+araba2.yil+"\nFiyat : "+araba2.fiyat);



        Araba araba3 =new Araba("Opel","Arsta",2015,8000);

        System.out.println("Araba 3 bilgiler\n" +
                "Marka : "+araba3.marka+"\nModel : "+araba3.model+"\nYil : "+araba3.yil+"\nFiyat : "+araba3.fiyat);





    }










}

