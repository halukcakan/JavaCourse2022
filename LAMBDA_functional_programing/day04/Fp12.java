package LAMBDA_functional_programing.day04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp12 {
    public static void main(String[] args) {

        Courses courseTurkishDay = new Courses("Summer","Turkish day",97,128);
        Courses courseTurkishNight = new Courses("Winter","Turkish night",98,154);
        Courses courseEnglishDay = new Courses("Spring","English day",96,132);
        Courses courseEnglishNight =new Courses("Winter", "English night",93,144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(ortalamaPuanlarSayidanBuyukMu(coursesList, 50));
        System.out.println();
        System.out.println(kelimeKursAdlariIcindeVarMi(coursesList, "Turkish"));
        System.out.println();
        System.out.println(ortalamasiEnYuksekKursunAdiniYadir(coursesList));
        System.out.println();
        System.out.println(ortalamaPuanaGoreSiralaSonraIlkVerilenleriAtla(coursesList, 1));
        //  siralamadan sonra 1 inciyi atlar digerlerini yazdirir


    }

    //  tum ortalama puanalarin istenen sayidan buyuk olup olmadigini kontrol et
    public static boolean ortalamaPuanlarSayidanBuyukMu (List<Courses> list, int x){
        return list
                .stream()
                .allMatch(t->t.getAvaregeScore()>x);
    }

    public static boolean kelimeKursAdlariIcindeVarMi (List<Courses> list, String kelime){
        return list
                .stream()
                .anyMatch(t-> t.getCourseName().contains(kelime));
    }

    public static String ortalamasiEnYuksekKursunAdiniYadir (List<Courses> list){
        return list
                .stream()
                .sorted(Comparator.comparing(Courses::getAvaregeScore).reversed())
                .findFirst()
                .get().getCourseName();
    }

    public static List<Courses> ortalamaPuanaGoreSiralaSonraIlkVerilenleriAtla
            (List<Courses> list, long x){
        return list
                .stream()
                .sorted(Comparator.comparing(Courses::getAvaregeScore))
                .skip(x)
                .collect(Collectors.toList());
    }
}
