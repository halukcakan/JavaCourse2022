package Lesson28_Construction;

public class ogretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println(ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("Emre","Akdogan","01/01/2001","Fizik","Matematik");
        System.out.println("Ogretmen 2 : "+ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("Ozlem","Kabak","02/09/1995");
        System.out.println("Ogretmen 3 : "+ogretmen3);
        
    }
}
