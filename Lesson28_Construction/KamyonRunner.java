package Lesson28_Construction;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1 = new Kamyon();

        System.out.println("Kamyon 1 ozellikleri : "+kamyon1.toString());


        Kamyon kamyon2 = new Kamyon("Mercedes","4140",2005,50000);

        System.out.println("Kamyon 2 bilgileri : "+kamyon2);


        Kamyon kamyon3 =new Kamyon("Scania","S540");

        System.out.println("Kamyon bilgileri : "+kamyon3);






    }
}
