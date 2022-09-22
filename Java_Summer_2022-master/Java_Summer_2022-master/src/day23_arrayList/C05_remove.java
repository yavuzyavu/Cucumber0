package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {

        List<Integer> sayilar1= new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println("sayilar1 = " + sayilar1);// [5, 3, 2, 1]

        sayilar1.remove(1);
        /*
        sayilardan olusan bir list varsa
        java remove method'unda sayi yazdigimizda direkt index olarak kabul eder
         */
        System.out.println("sayilar1 = " + sayilar1); // [5, 2, 1]

        // illa da 5'i silsin istiyorum
        Integer sil=5;
            // silinecek elemani variable olarak tanımlayabilirim
        sayilar1.remove(sil);
        System.out.println("sayilar1 = " + sayilar1);// [2, 1]
            // veya indecOf method'undan yardim alabilirim

        sayilar1.remove(sayilar1.indexOf(2));
        // 2'yi silmek icin 2'nin index'ini bulup, onu remove()'a yazabiliriz
        System.out.println("sayilar1 = " + sayilar1);// [1]

    }
}
