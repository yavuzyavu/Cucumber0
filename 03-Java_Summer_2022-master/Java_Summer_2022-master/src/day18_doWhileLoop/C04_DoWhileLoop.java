package day18_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan tam sayilar alin
        kullanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */

        Scanner scan= new Scanner(System.in);

        int sayi=0;

        // while ile
        /*
        Loop'larda kullanacagimiz variable'lari loop'tan once olusturmaliyiz
        while loop'ta, loop'dan once olusturdugumuz bu variable'a
        atayacagimiz degeri iyi dusunmemiz gerekiyor
         */

        while (sayi%2==0){
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();

            if (sayi%2==0){

                System.out.println("Girilen sayi cift : "+sayi);
            }else {
                System.out.println("Girilen sayi tek");
            }

        }

        // do while ile yapalim

        // do while loop'da onceden olusturulan variable'a hangi dewger atandiginin
        //hic bir onemi yok, kodumuz her durumda calisir

        /*
        Do-while'in dezavantaji:
        ilk calistirma kontrol yapilmadan oldugu icin
        loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekiyor
         */

        do {

            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();

            if (sayi%2==0){

                System.out.println("Girilen sayi cift : "+sayi);
            }else {
                System.out.println("Girilen sayi tek");
            }

        }while (sayi%2==0);

    }
}
