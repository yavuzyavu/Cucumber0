package day17_nestedForLoop;

import java.util.Scanner;

public class C10_SayiyiTersCevir {
    public static void main(String[] args) {

/*
    Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

    Input :1238

    Output :Girilen Numananin Tersi: 8321
     */

            Scanner scan= new Scanner(System.in);
            System.out.println("lutfen bir tam sayı giriniz");
            int sayi= scan.nextInt();

            int tersten=0;

            while (sayi!=0){
                int temp=sayi % 10;
                tersten=tersten*10+temp;
                sayi/=10;
            }
        System.out.println(tersten);

//            String sayi1= String.valueOf(sayi);
//
//            for (int i = sayi1.length()-1; i >=0 ; i--) {
//
//                System.out.print(sayi1.substring(i,i+1));
//
//            }

    }
}
