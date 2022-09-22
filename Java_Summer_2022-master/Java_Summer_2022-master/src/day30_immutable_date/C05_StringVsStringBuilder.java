package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {

        /*
        String mi yoksa StringBuilder'mi daha hizlidir ?
        bunun ici bir String olusturup, 1000 kere sonuna . ekleyelim
        oncesinde ve sonrasinda zamani alip
        aradaki farki bulalim

        ayni islemi StringBuilder icin de yapalim
         */

        LocalTime baslangic= LocalTime.now();
        String str="Ahhh Java";
        for (int i = 0; i < 10000; i++) {
            str+=".";
        }
        LocalTime bitis= LocalTime.now();

        System.out.println("baslangic = " + baslangic);// 19:27:48.593005500
        System.out.println("bitis = " + bitis);        // 19:27:48.650400900

        System.out.println("String Zaman : "+(bitis.getNano() - baslangic.getNano()));// 57395400


         baslangic= LocalTime.now();
        StringBuilder sb=new StringBuilder("Ahhh Java");
        for (int i = 0; i < 10000; i++) {
           sb.append(".");
        }
         bitis= LocalTime.now();

        System.out.println("baslangic sb = " + baslangic);// 19:27:48.668496500
        System.out.println("bitis sb = " + bitis);        // 19:27:48.669399900

        System.out.println("StringBuilder Zaman : "+(bitis.getNano() - baslangic.getNano()));// 903400




    }
}
