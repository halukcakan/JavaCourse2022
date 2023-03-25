package Lesson12_StringManipulation;

public class C02_ReplaceAll {
    public static void main(String[] args) {


        String str = "1Bu2gun Ja0va =cok gu&(z)el";

        // butun ozel karakterleri sil
        //      \\W tum space karakterleri de sildigi icin
        //      space yerince once farkli bir atama yapacagiz  [metinde bulunmayan]

        str= str.replace(" ","qwe");
        str =str.replaceAll("\\W", "");

        System.out.println(str);

        str=str.replaceAll("\\d","");

        System.out.println(str);

        str=str.replace("qwe", " ");

        System.out.println(str);






    }
}
