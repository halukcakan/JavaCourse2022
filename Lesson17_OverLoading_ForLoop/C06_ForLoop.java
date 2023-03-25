package Lesson17_OverLoading_ForLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        C05_ForLoop.tertenYazdir("Cemile");

        // 100`den 1`e kadar (dahil) 8 ile bolunebilen sayilari yazdir

        for (int i = 100; i >=1 ; i--) {

            if (i%8 == 0){
                System.out.print(i+" ");;
            }

        }



    }
}
