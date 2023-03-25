package Lesson35_Encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        /*
        arb1 objesi uzerinden marka variable'ina
        ulasabildim
        degistirebildim (set)
        yazdirabildim (get)
         */
        Araba arb1 = new Araba();
        arb1.marka = "Toyota";
        System.out.println(arb1.marka);


        /*
        access modifier kullanarak marka variable'ina
        ulasimi tamamen serbest birakabilir
        ya da
        tamamen engelleyebilirim

        private olan modele hic olasamamak GIBI
         */

        arb1.setModel("Corolla");                     //  atama yaptik
        System.out.println(arb1.getYakit());        //  bilgiyi yazdirdik

    }
}
