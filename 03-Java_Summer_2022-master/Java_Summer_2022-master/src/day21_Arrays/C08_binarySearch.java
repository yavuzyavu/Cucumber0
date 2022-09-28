package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        /*
        Binary search javada eleman aramanin kisa yoludur
        ancak binary search calismasi icin once
        array'in sirali hale getirilmesi gerekir
        Eger sisralama yapmadan binary search yaparsaniz
        sonucu bulamayabilir veya yanlis bulabilir
         */

        String [] harfler = {"Y","B","D","G","O","A"};

        String arananHarf="Y";

        System.out.println(Arrays.binarySearch(harfler, arananHarf));// -7
        System.out.println(C03_Contains.contains(harfler, arananHarf));//true

        // binary search bize aradigimiz elemanin index'ini dondurur
        // array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        // emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));// [A, B, D, G, O, Y]
        System.out.println(Arrays.binarySearch(harfler, arananHarf));//5
        System.out.println(C03_Contains.contains(harfler, arananHarf));//true


    }
}
