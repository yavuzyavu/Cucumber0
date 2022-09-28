package day37_overriding;

public class C03_Supra extends C03_Toyota{


    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private method'lar override edilemez
        Eger Child class'da parent class'taki private method ile
        aynii signature'da bir method olusturursaniz
        bu overriding method OLMAZ

         */
    }

    @Override
    void motor() {

        /*
        @Override notasyonu Java'ya bir gorev verir
        Java, bu notasyonla birbirine bagli olan iki method'u
        surekli kontrol eder
        eger parent class'taki overriden method'u silerseniz
        CTE verir


        @Override notasyonu kullanmak mecburi degildir
        Eger Overriden method silinirse kodun CTE vermesini istersek
        @Override notasyonu kullanmaliyiz
         */

        System.out.println("Sırali 6 silindir 2JZ kullanır hocam");
    }

}
