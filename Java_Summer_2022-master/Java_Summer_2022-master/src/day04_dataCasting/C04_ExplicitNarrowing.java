package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {


        int sayi1=50;
        byte sayi2=(byte) sayi1;
        System.out.println("sayi2 = " + sayi2); //50

        /*
        genis data turundeki degeri dar data turundeki variable'a atamak
        isterseniz java sizin genis  data turundeki degerin, dar data turunun
         sinirlarina uyup uymayacagini bilemez ve risk almaz.
         Riski 0'a indirmek icin burada bir sorun olursa sorumlulugu kabul etmenizi bekler
         bunun icin degerin onune (istenen data type) yazmamiz yeterlidir.

         Bu riski ustlendigimizde, 3 durun olusabilir
         1-bizim degerimiz, dar kalip degerlerine uygun olursa hic bir sorun yoktur
         2-double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yasayabiliriz
         3-genis kalipdan degeri dar kaliba koydugumuzda sinirlari asan durumlarda
           veri baskalasabilir

         */

    }
}
