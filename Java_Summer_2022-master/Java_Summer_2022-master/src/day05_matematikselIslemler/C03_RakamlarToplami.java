package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli pozitif bir tam sayi giriniz");

        int sayi= scan.nextInt(); //5267

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        // su anda sayi 5267 birlerBasamagi=0 rt=0

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;
        // su anda sayi 526 birlerBasamagi=7 rt=7

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;
        // su anda sayi 52 birlerBasamagi=13 rt13

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;
        // su anda sayi 5 birlerBasamagi=15 rt=15

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;
        // su anda sayi 0 birlerBasamagi=20 rt=20

        System.out.println("sayinin rakamlari toplami : "+rakamlarToplami);

    }
}
