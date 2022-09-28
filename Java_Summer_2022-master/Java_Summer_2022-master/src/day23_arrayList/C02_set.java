package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
        elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urunle degistirip
        eski urunu, var olan eski urunler listesine ekleyelim
         */

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler = new ArrayList<>();
        //listedeki Ikram'in yerine Biskrem koyalim,
        // Ikram'i da eski urunler listesine ekleyelim

        String yeniUrun= "Biskrem";
        String silinecekUrun="Ikram";

        int temp = urunler.indexOf(silinecekUrun);
        urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinecekUrun);

        System.out.println("urunler Listesi = " + urunler);
        System.out.println("eskiUrunler Listesi = " + eskiUrunler);



         yeniUrun= "Kahve";
         silinecekUrun="Cay";

         temp = urunler.indexOf(silinecekUrun);
        urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinecekUrun);

        System.out.println("urunler Listesi = " + urunler);
        System.out.println("eskiUrunler Listesi = " + eskiUrunler);


    }
}
