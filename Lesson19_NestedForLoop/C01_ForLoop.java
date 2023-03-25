package Lesson19_NestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // verilen string teki harfleri
        // tekrarsiz olarak yazdiran
        // kelimede kullanilan farkli harf sayisini giriniz

        String input = "taka tuka";

        tekrarsizYap (input);



    }

    public static void tekrarsizYap(String input) {

        String benzersizInput ="";

        String islenecekKelime = input.replaceAll("\\W","");    // Javaherzamanguzel
        System.out.print(input.substring(0,1));   //J
        benzersizInput+=input.substring(0,1);   //J

        for (int i=1 ; i <= islenecekKelime.length()-1 ; i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }

        System.out.println("");
        System.out.println("input : "+input);
        System.out.println("benzersiz input : "+benzersizInput);


    }
}
