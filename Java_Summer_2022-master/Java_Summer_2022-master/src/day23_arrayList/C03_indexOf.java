package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("ikram")); // 1
        System.out.println(urunler);

        /*
        indexOf() method'u  bize bilgi donduren bir method'dur
        listemizi degistirmez
         */
        System.out.println(urunler.lastIndexOf("Ikram"));

        /*
        indexOf() method'u urunu aramaya 0. indexten,
        lastIndexOf() methodu ise aramaya son index'ten baslar

        arama bitip, urun bulundugunda,
        ikisi de bulunan urunun index'ini verir
         */

        urunler.add("Ikram");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram")); // 1
        System.out.println(urunler.lastIndexOf("Ikram"));// 4

        System.out.println(urunler.indexOf("Hobby"));// -1
        System.out.println(urunler.lastIndexOf("Hobby"));// -1

    }
}
