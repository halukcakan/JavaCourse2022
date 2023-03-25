package Lesson17_OverLoading_ForLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        // input olarak verilen string i terse cevirip yazdiran bir method olustur

        String str = "Java gun gectikce guzellesiyor";

        tertenYazdir (str);



    }

    public static void tertenYazdir(String str) {

        String tersStr = str.substring(str.length()-1);


        for (int i=str.length()-2 ; i>=0 ; i--) {
            tersStr += str.substring(i,i+1);

        }

        System.out.println(tersStr);
    }
}
