package Lesson43_AbstractClass_Interface;

public class GCorolla extends EToyota {
    @Override
    protected void kaporta() {

    }

    /*
    corolla'nin 2 tane parent'i var (Araba&Toyota)
    ikisininde standartlarina uymak zorundadir
     */

    /*
    Concrete bir class parent'i olan tum abstract class'larda
    abstract olan methodlari imlement etmek zorundadir
    ancak parent silsilesinde override edilerek concrete yapilan method'lari
    override etmek zorunda DEGILDIR
     */
}
