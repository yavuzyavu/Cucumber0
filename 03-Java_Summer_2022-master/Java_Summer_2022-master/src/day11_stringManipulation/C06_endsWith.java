package day11_stringManipulation;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {

         /*
            Soru 1) Kullanicidan input adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “input adresiniz kaydedildi “ ,
            @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin yazdirin"
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen mail adresi yaziniz");
        String input=scan.nextLine();
        
        if (!input.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
            
        }else if (input.endsWith("@gmail.com")){
            System.out.println("input adresiniz kaydedildi");
            
        }else {
            System.out.println("lutfen yazimi kontol edin yazdirin");
        }

    }
}
