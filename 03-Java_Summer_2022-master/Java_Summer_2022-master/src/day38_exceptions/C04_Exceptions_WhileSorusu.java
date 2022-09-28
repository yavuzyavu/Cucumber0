package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions_WhileSorusu {
    public static void main(String[] args) {

        /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
        Kullaniciya index' sorup, o index'deki urunu yazdiran bir
        program hazirlayalim
        Kullanici urun sayisinden buyuk bir index girerse
        exception vermesinin onune gecelim
         */


        String[] urunler= {"Nutella","Cokokrem","Sut","Cay","Findik"};

        Scanner scan = new Scanner(System.in);

        int istenenIndex=0;


        while (true) {
            try {

                System.out.println("Istediginiz urunun sira nosunu giriniz");
                istenenIndex = scan.nextInt();

                System.out.println("Aradiginiz urun : "+ urunler[istenenIndex-1]);

                break;

            } catch (InputMismatchException e) {

                System.out.println("Urun index'i icin bir tam sayi girmeniz gerekli");

                scan.next();
                continue;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor \nSira numarasi en fazla : "+(urunler.length)+" olabilir");
                scan.nextLine();
                continue;
            }
        }

    }
}
