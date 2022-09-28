package day14_methodCreation;

import day13_methodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        // Verilen 3 basamakli bir sayinin
        // rakamlari toplamini yazdiran bir method olusturalim

        int input= 423;

        rakamlariTopla(input);
        C04_MethodCreation.toplama(6,4);
        C01_MethodCreation.terstenYazdir("Nuri");

    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi=temp%10;
        rakamlarToplami+=birlerBasamagi;
        temp/=10;

        birlerBasamagi=temp%10;
        rakamlarToplami+=birlerBasamagi;
        temp/=10;

        birlerBasamagi=temp%10;
        rakamlarToplami+=birlerBasamagi;
        temp/=10;

        System.out.println("Girdiginiz "+input+" sayisinin rakamlar toplami : "+ rakamlarToplami);

    }
}
