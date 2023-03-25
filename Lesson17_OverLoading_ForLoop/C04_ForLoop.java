package Lesson17_OverLoading_ForLoop;

public class C04_ForLoop {
    public static void main(String[] args) {

        // birden bese kadar(dahil) olan tam sayilari topla

        int toplam = 0;


        for (int i=1 ; i<6 ; i++) {

            toplam += i;

        }


        System.out.println("Toplam : "+toplam);


        toplam = 0;

        for (int i = 10; i <=20 ; i++) {
            toplam += i;
        }

        System.out.println("Toplam : "+toplam);

        toplam = 0;

        // kontrol etmeden 30 ve 50 arasi cift sayilar toplami

        for (int i = 30; i <= 50 ; i+=2) {
            toplam += i;
        }

        System.out.println("Toplam : "+toplam);

        // kontrol EDEREK 30 ve 50 arasi cift sayilar toplami

        toplam = 0;

        for (int i = 30; i <= 50 ; i++) {
            if (i%2==0){
                toplam += i;
            }

        }

        System.out.println("Toplam : "+toplam);

        // kontrol ederek 1000 ve 1500 arasi yedi ile bolunebilen sayilar toplami

        toplam = 0;

        for (int i = 1000; i <= 1500 ; i++) {
            if (i%7==0){
                toplam += i;
            }

        }

        System.out.println("Toplam : "+toplam);




    }
}
