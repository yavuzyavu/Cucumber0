package day34_inheritance;

public class C02_ToyotaCorolla extends C02_Toyota{

    public static void main(String[] args) {

        /*
        child class'dan parent class'a erisimde
        access modifier kurallarini bypass edemeyiz
        ornegin parent class'daki private class uyelerini child class'dan kullanamayiz
        ayni sekilde parent ve child  farkli package'larda ise
        parent class'daki default access modifier'i
        olan class uyelerini child class'dan kullanamayiz
         */

        C02_ToyotaCorolla arb1= new C02_ToyotaCorolla();

        System.out.println(arb1.marka);// Toyota


    }


}
