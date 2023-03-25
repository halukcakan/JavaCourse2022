package Lesson35_Encapsulation;

public class Araba {

    String marka = "MArka belirtilmedi";
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrili";     //   tum arabalar elektirikli ise bu variable degistirilmemesi lazim

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }

}
