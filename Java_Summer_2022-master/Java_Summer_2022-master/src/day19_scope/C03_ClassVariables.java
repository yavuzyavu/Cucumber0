package day19_scope;

public class C03_ClassVariables {


    public static void main(String[] args) {

        /*
        Farkli bir classta calisirken
        her hangi bir class adini yazip .'ya basarsak
        adini yazdigimiz class'taki tum STATIK class uyelerini gorebilir
        ve kullanabiliriz
         */

        C02_StaticVariables.staticMethod();// 10
        System.out.println(C02_StaticVariables.staticSayi); // 10
        System.out.println(C02_StaticVariables.degersizStaticVar);//0

        /*
        Class level variable'lara deger atayip atamamak bbize kalmistir
        istersek deger atamasi yapariz , istemezsek deger atamayiz
        Eger deger atamissak Java atadigimiz o degeri kabul eder
        deger atamazsak Java bu variable'lara default bir deger atamasi yapar

        int -> 0
        String -> null
        boolean -> false
        char -> '' hiclik
         */

        /*
        Baska class'daki instance variable'lara obje olusturarak ulasabiliriz
         */

        C02_StaticVariables obj1=new C02_StaticVariables();
        obj1.staticOlmayanMethod(); //10
        // bu method icinde staticSayi=20 oldu

        System.out.println(obj1.isim);// Mehmet
        System.out.println(obj1.degersizInstanceVar);// 0


        System.out.println(C02_StaticVariables.staticSayi);

        /*
        Farkli bir classtan C02 classindan method ve variable'lari kullandigimda
        C02 classinin tamami degil sadece benim cagirdigim class uyeleri calilsir
         */

    }
}
