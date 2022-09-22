package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // bir önceki soruyu tek seferde kullanicidan tum bilgileri alarak yapiniz

         /*
        kullanicidan ismini soy ismini ve yasini alip
        girilen bilgiler = seyfi capar 34 seklinde yazdirin
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen isminizi, soy isminizi ve yasinizi giriniz \naralarda ENTER tusuna basiniz");

        String isim=scan.nextLine();

        String soyIsim=scan.nextLine();

        int yas= scan.nextInt();

        System.out.println("girilen bilgiler = "+isim+" "+soyIsim+" "+yas);

    }
}
