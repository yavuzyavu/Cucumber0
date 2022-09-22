package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        /* tek katli arraylerde array'i direkt yazdiramiyoruz
        cunku array non-primitive data turudur ve
        her non-primitive data direkt yazdirilamayabilir

        ancak array'in icerisindeki elementleri direkt yazdirabiliyorduk
        cunku genellikle primitive data turu veya String elementler kullaniliyordu

        Multi-dimensional array'lerde en dikkat edecegimiz konu
        ulasmak istedigimiz elementin bir array mi yoksa
        primitive data mi oldugudur
         */

        int [][] sayilar = {{1,2,4,5},{3,4}};

        /*
        burada sayialr array'ini dusunursek icinde 2 tane inner array var
        sayilar[0] ==> [1,2,4,5]'i dondurmez. Cunku arraydir.

        ancak en icerideki elementlere ulasirsak  direkt yazdirabiliriz
         */
        System.out.println(sayilar[0]);// [I@27f674d
        System.out.println(Arrays.toString(sayilar[0]));// [1,2,4,5]

        System.out.println(sayilar[0][1]);// 2
        System.out.println(sayilar[1][0]);// 3

        System.out.println(sayilar);// [[I@1d251891
        System.out.println(Arrays.toString(sayilar));// [[I@27f674d, [I@48140564]
        System.out.println(Arrays.deepToString(sayilar));// [[1, 2, 4, 5], [3, 4]]

        /*
        Array'i 2 sekilde deklare edebiliyorduk
        1- elemanlari direkt yazabiliriz -> int [][] sayilar = {{1,2,4,5},{3,4}};
        2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz -> int [][] sayiler = new int [3][4];

        anca 2. yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin outer array'in 3 tane inner array'i vardır
        her bir array'in ise 4'er elemani vardir

        eger inenr array'leri farkli uzunluklarda olusturmak istiyorsaniz
        mecburen 1. yontemi kullanmalisiniz
         */

    }
}
