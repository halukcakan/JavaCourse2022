package Lesson26_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_unique_array {
    public static void main(String[] args) {

        // verilen bir arrayde unique elementleri
        // yeni bir array olarak donduren method

        int arr [] = {3,3,46,45,34,56,6,7,34,2,246,457,5,33,2,4,56,76,3,2,45,6,2};

        int [] uniqueArray = uniqueArrayOlustur(arr);

        System.out.println(Arrays.toString(uniqueArray));








    }

    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> benzersizList = new ArrayList<>();

        for (int i = 0; i < arr.length-1 ; i++) {

            if (arr[i]!=arr[i+1]){
                benzersizList.add(arr[i]);
            }

        }
        if (!benzersizList.contains(arr[arr.length-1])){    // yukaridaki for loop son elementi kontrol etmedigi icin
            benzersizList.add(arr[arr.length-1]);           // bu if loop ile son elementi kontrol ettik
        }

        //  benzersizList'e olustu simdi array olusturacayiz

        int [] tekrarsizArr = new int [benzersizList.size()];

        for (int i = 0; i < tekrarsizArr.length ; i++) {
            tekrarsizArr[i]= benzersizList.get(i);
        }


        return tekrarsizArr;
    }
}
