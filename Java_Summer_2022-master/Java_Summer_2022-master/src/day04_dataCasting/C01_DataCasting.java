package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {

        // a charini b yapmaya calisiyoruz
        char harf = 'a';
        //char yeniHarf = harf+1; //kod bu durumda once sagdaki islemi yapar
                                  // char yaniHarf= 97+1 -->98
                                  // char bir variable 98 olamayacagi icin Java hata verir
        char yeniHarf = (char)(harf+1); //b

        System.out.println("yeniHarf = " + yeniHarf);

        /*
        bazen bir variable'a olusturuldugu veri turunden baska deger atanabilir
        bunlardan bazisini java otomatik olarak kabul eder

        Java eger bu deger atamasinda sorun olusacagini
        (data kayiplarinin olaiblecegi veya datanin baskalasabilecegi) gorurse
        bu durumda otomatik olarak bu atamayi kabul etmez
        sizden , eger bu atamayi istiyorsaniz sorumlulugu almanizi bekler
         */

        int sayi= (int)7.3;
        System.out.println("sayi = " + sayi);//7

        double sayi2=10;
        System.out.println("sayi2 = " + sayi2);

        int sayi3='c'; // 99
        System.out.println("sayi3 = " + sayi3);

        char harf2=98; // b
        System.out.println("harf2 = " + harf2);


    }
}
