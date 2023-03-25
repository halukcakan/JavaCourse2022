package Lesson37_Inheritance;

public class FMemur extends EMuhasebe {
    FMemur() {
        System.out.println("FMemur parametresiz cons");
    }

    FMemur(String isim) {
        super(isim);
        System.out.println("FMemur parametreli cons");
    }

    public static void main(String[] args) {

        FMemur mmr1 = new FMemur("Ali");


    }
}
