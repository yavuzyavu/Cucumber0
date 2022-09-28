package day14_methodCreation;

import day13_methodCreation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        // input olarak verilen  4 harfli bir Stringi
        // tersten yazdiran bir method olusturalim

        terstenYazdir("mali"); // ilam

        C04_MethodCreation.toplama(6,5); // ilam

    }

    public static void terstenYazdir(String input){
        String tersInput=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);

        System.out.println("Verilen kelimenin tersten yazilisi : "+tersInput);
    }

}
