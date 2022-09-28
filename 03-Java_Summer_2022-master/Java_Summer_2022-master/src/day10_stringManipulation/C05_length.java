package day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.length());// 19 str'in karakter sayisini dondurur

        System.out.println(str.charAt(str.length()-1)); // p son karakteri yazdirir

        System.out.println(str.charAt(str.length()-3));// k  sondan 3. karakteri yazdiralim

        /*
        Javada null pointer (isaretleyici) bir deger degil,
        karsisina yazildigi variable'in hic bir deger almadiginin isaretcisidir
         */

        String str2 =""; // str2'ye bir deger atanmis -> HICLIK
        System.out.println(str2.length());//0


        String str3=null; // str3'e bir deger atanmis midir ? -> HAYIR ,
                            // null bu deger atanmamasini isaretlemektedir
        System.out.println(str3.length());// deger atanmadigi icin uzunluk veremez ve NullPointerException firlatir

    }
}
