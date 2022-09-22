package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str="Java Cok Guzel";
        str.toUpperCase();

        int sayi=10;
        /*
        primitive data turlerinin yaninda method'lar olmaz
        java bazi methodlari kullanabilmemiz icin
        her bir primitive data turu icin wrapper class olusturmustur
         */

        Integer sayi2=10;
        sayi2.byteValue();
    }
}
