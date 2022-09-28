package day26_constructor;

public class C02_KamyonRunner {
    public static void main(String[] args) {

        C02_Kamyon kamyon1=new C02_Kamyon();

        System.out.println("kamyon1 ozellikleri "+kamyon1.toString());


        System.out.println("******************");

        C02_Kamyon kamyon2=new C02_Kamyon("Mercedes","4140",2005,500000);

        System.out.println("kamyon2 bilgileri "+kamyon2.toString());


        System.out.println("******************");

        C02_Kamyon kamyon3=new C02_Kamyon("MAN","as900",2007,400000);

        System.out.println("kamyon3 bilgileri "+kamyon3.toString());


        System.out.println("******************");

        C02_Kamyon kamyon4=new C02_Kamyon("Scania","s540");

        System.out.println("kamyon4 bilgileri "+kamyon4.toString());


    }
}
