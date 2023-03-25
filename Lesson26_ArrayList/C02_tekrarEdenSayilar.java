package Lesson26_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_tekrarEdenSayilar {
    public static void main(String[] args) {

        //  verilen bir array'deki tekrar eden sayilari yazdirin

        int arr [] = {3,3,46,45,34,56,6,7,34,2,246,457,5,33,2,4,56,76,3,2,45,6,2};

        Arrays.sort(arr);       //  siraladik


        List<Integer> tekrarEdenler = new ArrayList<>();

        for (int i = 0; i < args.length-1 ; i++) {
            if (arr[i]==arr[i+1] && !tekrarEdenler.contains(arr)){
                System.out.println(arr[i]+" ");
                tekrarEdenler.add(arr[i]);
            }
        }



    }
}
