package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {

        /*
    1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
    2- isim ve soyisim icin iki variable olusturun ve bunlari
    isminiz : Mehmet
    soyisminiz : Bulutluoz
    seklinde yazdirin
    3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
    4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
    5 – char data turunde bir variable olusturun ve yazdirin
    6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

         */
        int sayi=10;
        int sayi2=20;
        boolean guzelMi=true;
        char sayim='3';

        // 1-
        System.out.println(sayi);//10
        System.out.println("sayi");//sayi
        System.out.println("sayi : " + sayi);//sayi : 10
        System.out.println(sayim);//3
        System.out.println(guzelMi);//true

        // 2-
        String name= "Furkan";
        String surname= "YILMAZ";

        System.out.println("Adiniz : "+name+"\nSoyadiniz : "+surname);

        // 3-
        int sum = sayi+sayi2;
        System.out.println(sum);

        // 4-
        double ondalikliSayi= 56.5;
        double sum2= ondalikliSayi+sayi;
        System.out.println(sum2);

        // 5-
        char ch='A';
        System.out.println(ch);

        // 6-
        System.out.println(sayi+ch); //ASCII




    }
}
