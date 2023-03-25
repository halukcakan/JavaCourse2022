package Lesson11_StringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {

        // 2. ve 3. e harflerini bu ve yazdir


        String str = "Java ogrenmek cok guzel";


        int ilkE = str.indexOf("e");

        int ikinciE = str.indexOf("e", ilkE+1);

        // eger ikinci e varsa ucuncu e olup olmadigini kontrol edelim

        if (ikinciE==-1) {
            System.out.println("verilen str de ikinci e yok");

        } else {
            int ucuncuE = str.indexOf("e", ikinciE+1);

            if (ucuncuE==-1){
                System.out.println("verilen str de ucuncu e yok");
            } else {
                System.out.println("verilen str de ucuncu e nin index`i: "+ ucuncuE);

            }


        }



    }
}
