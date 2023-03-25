package Lesson27_Constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.fiyat= 150000;
        car1.yil= 2020;
        car1.marka="Toyota";

        System.out.println("Car 1 bilgiler\n" +
                "Marka : "+car1.marka+"\nModel : "+car1.model+"\nYil : "+car1.yil+"\nFiyat : "+car1.fiyat);

        Car car2 = new Car();

        System.out.println("Car 2 bilgiler\n " +
                "Marka : "+car2.marka+"\nModel : "+car2.model+"\nYil : "+car2.yil+"\nFiyat : "+car2.fiyat);







    }
}
