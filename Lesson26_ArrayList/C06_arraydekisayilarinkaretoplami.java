package Lesson26_ArrayList;

public class C06_arraydekisayilarinkaretoplami {
    public static void main(String[] args) {


        int [] sayilar = {2,3,8,2,7,4,5};

        int toplam = 0;

        for (int each: sayilar
             ) {
            toplam+= each*each;
        }

        System.out.println("Kareler toplami : "+toplam);


    }
}
