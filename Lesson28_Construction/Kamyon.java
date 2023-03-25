package Lesson28_Construction;

public class Kamyon {
    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String markaK, String modelK, int yilK, int fiyatK) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

    }
    public Kamyon(){

    }

    @Override
    public String toString() {
        return "" +
                "\nmarka=" + marka +
                "\nmodel=" + model +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat;
    }


    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }





}
