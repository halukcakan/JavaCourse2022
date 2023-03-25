package Lesson33_TimerFormatter_Varargs;

public class C04_varargs_2 {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir (4,"Ali","Ayse","Ismail","Babayigit");


    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime = kelime[0];

        for (String each:kelime
             ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println(enUzunKelime);
    }
}
