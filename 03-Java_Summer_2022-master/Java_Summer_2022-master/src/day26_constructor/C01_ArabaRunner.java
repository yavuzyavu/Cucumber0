package day26_constructor;

import day25_constructor.C03_Car;

public class C01_ArabaRunner {
    public static void main(String[] args) {
        // bir gun onceki C03_Car class'indan obje olusturalim

        /*
        Farkli bir package'daki bir class'dan obje olusturdugumuzda
        access modifier'lari da dikkae almaliyiz
         */
        C03_Car car1=new C03_Car();
        System.out.println(car1.fiyat);

        /*
        Araba class'indan bir obje olusturdugumda
        eger default constructor kullanildiysa
        tum ozellikler icin tek tek deger atamak zorunda kaliriz
         */

        C01_Araba araba1=new C01_Araba();

        araba1.fiyat=10000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";

        System.out.println("araba1 bilgileri\nMarka : " + araba1.marka + "\nModel : " + araba1.model
                + "\nYil : " + araba1.yil + "\nFiyat : " + araba1.fiyat);

        /*
        Eger bir objeyi olustururken bazi ozelliklerini
        argument olarak belirtip
        o ozelliklerde bir obje olusturmak istersek
        Java itiraz eder.
        Cunku her class'da default constructor vardir
        ama o da parametresizdir
        bizim yeni ve parametreli constructor(lar)'a ihtiyacimiz var.
         */
        System.out.println("****************************************");


        C01_Araba araba2=new C01_Araba("BMW","5.20",2011,15000);

        System.out.println("araba2 bilgileri\nMarka : " + araba2.marka + "\nModel : " + araba2.model
                + "\nYil : " + araba2.yil + "\nFiyat : " + araba2.fiyat);


        System.out.println("****************************************");


        C01_Araba araba3=new C01_Araba("Opel","Astra",2015,78000);

        System.out.println("araba3 bilgileri\nMarka : " + araba3.marka + "\nModel : " + araba3.model
                + "\nYil : " + araba3.yil + "\nFiyat : " + araba3.fiyat);


        System.out.println("****************************************");


        C01_Araba araba4=new C01_Araba("Audi","A5",2020,50000);

        System.out.println("araba4 bilgileri\nMarka : " + araba4.marka + "\nModel : " + araba4.model
                + "\nYil : " + araba4.yil + "\nFiyat : " + araba4.fiyat);

    }
}
