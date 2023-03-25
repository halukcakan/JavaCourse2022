package Lesson36_Inheritance;

public class Toyota {
    protected String marka = "Marka belirtilmedi";
    private String model = "Model belirtilmedi";
    protected String yakit = "Yakit belirtilmedi";

    protected void aku(){
        System.out.println("toyota modele gore aku kullanilir");
    }

    protected void Motor(){
        System.out.println("Toyota cevreci motor kullanir");
    }
}
