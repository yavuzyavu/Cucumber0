package day29_PassByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {

        /*
        Immutable : degistirilemez
        Mutable : degistirilebilir

        en meshur immutabile class : String
         */

        String str= "Yildiz Bank";

        System.out.println(str.toUpperCase());// YILDIZ BANK

        str.toLowerCase();
        System.out.println(str);// Yildiz Bank

        System.out.println(str.substring(3, 5));//di

        System.out.println(str);//Yildiz Bank


        // Java'da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder cass'i da vardir

        StringBuilder sb=new StringBuilder("Java Bank");

        System.out.println(sb);// Java Bank

        sb.reverse();

        System.out.println(sb);// knaB avaJ

        sb.append(".");

        System.out.println(sb);//knaB avaJ.

    }
}
