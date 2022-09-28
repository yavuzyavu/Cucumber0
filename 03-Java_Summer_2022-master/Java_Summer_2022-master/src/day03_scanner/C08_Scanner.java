package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        //kullanicidan ismini alip, ilk harfini buyuk harfle yaziniz

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen isminizi girin");

        /*
        java scanner class'inda nextChar() methodu yoktur
        bunun yerine String olarak ilk kelimeyi alip
        onun da ilk harfini alabiliriz
         */

        char ilkHarf = scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi : "+ilkHarf);



    }
}
