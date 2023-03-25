package Lesson41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/day41_exceptions/test.txt");

    }
}
