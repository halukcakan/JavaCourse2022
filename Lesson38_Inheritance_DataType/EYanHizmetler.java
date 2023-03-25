package Lesson38_Inheritance_DataType;

public class EYanHizmetler extends BMuhasebe{

    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;
    protected void maas (){
        System.out.println("Yan hizmetlilier "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void isszlikSigorta (){
        System.out.println("Yan hizmetlilier %30 indirimli ozel sigorta yapilir");
    }

    public static void main(String[] args) {

        BMuhasebe yh1 = new EYanHizmetler();
        System.out.println(yh1.gunlukMesai);        //  M
        System.out.println(yh1.saatUcreti);         //  M
        yh1.maas();                                 //  YH  [override]
        yh1.ozelSigorta();                          //  M
        yh1.sigorta();                              //  P
        System.out.println(yh1.isim);               //  P
        System.out.println(yh1.soyisim);            //  P
        System.out.println(yh1.departman);          //  P
        // System.out.println(yh1.issizSigorta);        Muhasebe de issizlik sigortasi yok yazdirmiyor
    }

}
