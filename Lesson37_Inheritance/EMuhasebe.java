package Lesson37_Inheritance;

public class EMuhasebe extends DPersonel {

    EMuhasebe (){
        System.out.println("Muhasebe parametresiz cons");
    }

    EMuhasebe(String isim){
        super(isim);
        System.out.println("Muhasebe parametreli cons");
    }
}
