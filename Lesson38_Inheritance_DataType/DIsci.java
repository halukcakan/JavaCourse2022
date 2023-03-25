package Lesson38_Inheritance_DataType;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;
    protected void maasIsci (){
        System.out.println("Isciler "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void ozelSigortaIsci (){
        System.out.println("Isciler %70 indirimli ozel sigorta yapilir");
    }

    public static void main(String[] args) {
        BMuhasebe isci1 = new DIsci();

        isci1.maas();            //  M
        isci1.ozelSigorta();     //  M
        isci1.sigorta();         //  P

        APersonel isci2 = new DIsci();

        List<String> list1 = new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();

        /*
        hepsi LinkedList gibi olsa da
        list1 List gibi davranir
        list2 Deuqe gibi davranir
        list3 Queue gibi davranir
         */
    }

}
