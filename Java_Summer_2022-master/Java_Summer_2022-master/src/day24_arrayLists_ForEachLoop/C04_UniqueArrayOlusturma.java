package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {


        // Soru 2) Verilen bir array’deki tekrar elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun

        int [] arr={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int [] uniqueArray= uniqueArrayOlustur(arr);

        System.out.println(Arrays.toString(uniqueArray)); // [1, 2, 3, 4, 5, 6, 9]

    }

    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]

        List<Integer> uniqueList= new ArrayList<>();
        // yanindaki elemente esit olmayanlari listeye ekliyoruz
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]){
                uniqueList.add(arr[i]);
            }
        }
        // son elementi kontrol edip yoksa listeye ekliyoruz
        if (!uniqueList.contains(arr[arr.length-1])){
            uniqueList.add(arr[arr.length-1]);
        }

        // uniqueList size bilgisini kullanarak bir array olusturduk
        int [] tekrarsizArr= new int[uniqueList.size()];

        // uniqueList'deki elemanlari , yeni array e atadik
        for (int i = 0; i < uniqueList.size(); i++) {
            tekrarsizArr[i]=uniqueList.get(i);
        }
        // olusturdugumuz yeni array'i dondurduk
        return tekrarsizArr;
    }
}
