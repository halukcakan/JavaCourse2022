package Lesson38_Inheritance_DataType;

public class CMemur extends BMuhasebe{
    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;
    protected void maas (){
        System.out.println("Memurlar "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void ozelSigorta (){
        System.out.println("Memurlara %60 indirimli ozel sigorta yapilir");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();
        mmr1.maas();            //  Memurlar 3240 maas alir
        mmr1.ozelSigorta();     //  Memurlara %60 indirimli ozel sigorta yapili
        mmr1.sigorta();         //  Tum personelimize sigorta yapilir

        BMuhasebe mhsb1 = new BMuhasebe();
        mhsb1.maas();            //  Personel min : 2400 maas alir
        mhsb1.ozelSigorta();     //  Isteyen calisanlara %50 indirimli ozel sigo
        mhsb1.sigorta();         //  Tum personelimize sigorta yapilir

    }
}
