package Lesson28_Construction;

public class Araba {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
    }
    public Araba(){
    }

    public void benzinliArac (){
        System.out.println("Bu arac benzinli motora sahp");
    }


    public void maxHiz (int hiz){
        System.out.println("Bu araca max "+hiz+" km hiz yapar");
    }

}
