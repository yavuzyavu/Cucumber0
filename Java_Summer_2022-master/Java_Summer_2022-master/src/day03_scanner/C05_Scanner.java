package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan 2 sayi alip bu
        sayilarin carpimini yazdirin
        */

        Scanner scan= new Scanner(System.in);

        System.out.println("Carpilacak birinci sayiyi giriniz ");
        double carpan1=scan.nextDouble();

        System.out.println("Carpilacak ikinci sayiyi giriniz ");
        double carpan2=scan.nextDouble();

        double carpim=carpan1*carpan2;

        System.out.println("Girilen sayilarin carpim sonucu => " + carpim);

    }
}
