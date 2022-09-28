package day43_Interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);// [10, 20, 30]

        // listedeki tum elementleri index kullanmadan 3 artirin

        for (Integer each: liste) {
            each+=3;
            System.out.print(each + " ");
        }
        System.out.println("");
        System.out.println(liste);

        /*
        Java index yapisi olmayan collection'lardaki
        elementlere ulasmak veya degistirmek icin
        Iterator interface'ini olusturmustur.


        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir
        bunun yerine bize iterator donduren liste.iterator() method'unu kullaniyoruz
         */


        System.out.println(liste);// [10, 20, 30]

        Iterator it1 = liste.iterator();

        System.out.println(it1.next()); //10
        System.out.println(it1.next()); //20
        System.out.println(it1.next()); //30
        // System.out.println(it1.next()); //30'dan sorna element kalmadigindan next() method'u RTE verir

        /*
        Iterator'da geri donus yok, adim adim sona ulastiktan sonra
        basa gelmek isterseniz yeniden bir iterator olusturmaniz gerekir
         */

        Iterator it2 = liste.iterator();

        // yeni it2'yi kullanarak listenin tum elementlerini silelim

        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste);// iterator ile elementleri gezip, remove yapinca
                                  // liste kalici olarak degisti


        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("Yeniden liste : "+liste);

        Iterator it3= liste.iterator();

        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }

        System.out.println("Loop'dan sonra liste : "+liste);

        /*
        Goruldugu gibi iterator kullanarak yapabildigim
        1- Tum collection elementlerini yazdirmak
        2- Tum collection elementlerini silmek
        Bu da bize yetmez

         */

    }
}
