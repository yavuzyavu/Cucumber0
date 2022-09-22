package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));// 5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));// bana integer donduruyor
                                             // int'de yok bir deger bulunmuyor
                                             //0 dersek J'nin indec'idir
                                             // - bir deger donerse biz aranan string'in str'da olmadigindan
                                             // Java -1 dondurmeyi tercih ermistir

        String str5="kjsdhnasjdjasbndjkansbjdnbajksnbd jkasbdkj";

        // str5'te p harfi kullanilmis midir?
        if (str5.indexOf("=")==-1) {
            System.out.println("str5'te istenen karakter kullanilmamis");
        }else {
            System.out.println("str5'te istenen karakter kullanilmis");
        }


    }
}
