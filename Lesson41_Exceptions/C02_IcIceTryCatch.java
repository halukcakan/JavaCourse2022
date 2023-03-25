package Lesson41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {

        int k;
        try {
            FileInputStream fis = new FileInputStream("src/day41_exceptions/test.txt");

            while ((k=fis.read()) != -1){
                System.out.print((char) k);     // String'e list'e array'e atayabiliriz
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi/bozuk.");
        } catch (IOException e) {
            System.out.println("Dosyadan bilgiler okunamadi.");
        }
    }
}
