package LAMBDA_functional_programing.day02;

public class Utils {

    public static void ayniSatirdaBosluklarYazdir(Object obj){
        System.out.print(obj + " ");
    }

    public static boolean ciftElemanlariSec(Integer x){
        return x%2==0;
    }

    public static boolean tektElemanlariSec(Integer x){
        return x%2!=0;
    }

    public static int karesiniAl (int x){
        return x*x;
    }

    public static char sonKarakteriAl(String str){

        return str.charAt(str.length()-1);
    }

    public static char ilkKarakeriAl(String str){
        return str.charAt(0);
    }
}
