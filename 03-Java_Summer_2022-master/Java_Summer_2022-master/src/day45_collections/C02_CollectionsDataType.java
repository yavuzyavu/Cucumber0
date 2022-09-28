package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataType {
    public static void main(String[] args) {

        /*
        Collections <dataTuru> nu Object secmeniz durumunda
        Collection'a farkli data turlerinden objeler koymaniza izin verir
        Bu depolama acisindan bize esneklik saglar
        Ancak islem yaparken tum objeleri Object olarak tanimladigimizdan
        cok fazla casting yapmamiz gerekebilir.
         */

        List<String> liste=new ArrayList();

        // liste.add(5);
        // liste.add('c');
        // liste.add(true);

        List liste2=new ArrayList(); // => List<Object> liste2=new ArrayList()

         liste2.add(5);
         liste2.add('c');
         liste2.add(true);
         liste2.add("Ali");

        System.out.println(liste2);// [5, c, true, Ali]

        liste2.set(0,(Integer)liste2.get(0)+5);
        System.out.println(liste2); //[10, c, true, Ali]

        liste2.set(3,liste2.get(3)+" Can");
        System.out.println(liste2);// [10, c, true, Ali Can]

        liste2.set(2,!(Boolean)liste2.get(2));//


        Set set1=new HashSet();

        set1.add(1);
        set1.add(false);
        set1.add('3');

    }
}
